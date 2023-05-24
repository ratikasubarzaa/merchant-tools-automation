package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import webdriver.WebdriverInit;

public class WebdriverHook {

  @Before
  public void initialize() {
    WebdriverInit.initialize();
    //WebdriverInit.initializeWithSelenoid();
  }

  @AfterStep
  public void screenshoot(Scenario scenario) {
    TakesScreenshot screenshot = (TakesScreenshot) WebdriverInit.driver;
    byte[] byteImage = screenshot.getScreenshotAs(OutputType.BYTES);
    scenario.attach(byteImage, "image/png", "screenshot");
  }

  @After
  public void quit(Scenario scenario)
  {
    WebdriverInit.quit();
  }

}