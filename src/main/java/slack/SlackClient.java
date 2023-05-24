package slack;

import static io.restassured.RestAssured.given;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import slack.cucumber.ElementsItem;
import slack.cucumber.StepsItem;
import slack.cucumber.TestItem;


public class SlackClient {

  private static final String REPORT_LOCATION = "build" + File.separator + "cucumber.json";

  private static final String TITLE = "Web Automation Test Result";
  private static final String AUTHOR_NAME = "Ratika";
  private static final String SLACK_CHANNEL = "#merchant-ui-automation";
  private static AtomicInteger passed = new AtomicInteger();
  private static AtomicInteger failed = new AtomicInteger();

  public static void main(String[] args) {
    calculateTestResult();
    sendSlackNotifications(passed.get(), failed.get());
  }

  public static void calculateTestResult() {
    try {
      ObjectMapper mapper = new ObjectMapper();
      mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
      List<TestItem> testItem = mapper.readValue(
              Paths.get(REPORT_LOCATION).toFile(), new TypeReference<List<TestItem>>() {
              });
      testItem.stream().forEach(test -> {
        List<List<StepsItem>> data = test.getElements().stream().map(ElementsItem::getSteps)
                .collect(Collectors.toList());
        long countFailed = data.stream()
                .filter(steps -> {
                  boolean hasil = steps.stream()
                          .anyMatch(step -> !step.getResult().getStatus().equals("passed"));
                  return hasil;
                })
                .count();
        if (countFailed == 0) {
          passed.getAndIncrement();
        } else {
          failed.getAndIncrement();
        }
      });
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static Response sendSlackNotifications(int passTests, int failedTests) {

    String url = "https://app.slack.com/client/T0F6M3DV1/C058L485274";
    String tags = "@createMerchantonline";
    String status = failedTests > 0 || passTests == 0 ? "#FF0000" : "#36a64f";

    Entities attachments = new SlackNotificationBuilder()
            .withColor(status)
            .withPreText(TITLE)
            .withSlackChannel(SLACK_CHANNEL)
            .withAuthorName(AUTHOR_NAME)
            .withPassValue(String.valueOf(passTests))
            .withFailedValue(String.valueOf(failedTests))
            .build();
    Response response = given().log().all()
            .contentType(ContentType.JSON)
            .body(attachments)
            .post(url);
    response.then().log().all();
    return response;
  }
}
