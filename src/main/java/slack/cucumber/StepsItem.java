package slack.cucumber;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StepsItem{

	@JsonProperty("result")
	private Result result;

	@JsonProperty("line")
	private Integer line;

	@JsonProperty("name")
	private String name;

	@JsonProperty("match")
	private Match match;

	@JsonProperty("keyword")
	private String keyword;
}