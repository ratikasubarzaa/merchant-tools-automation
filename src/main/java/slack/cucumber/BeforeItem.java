package slack.cucumber;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeforeItem{

	@JsonProperty("result")
	private Result result;

	@JsonProperty("match")
	private Match match;
}