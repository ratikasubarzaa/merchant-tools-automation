package slack.cucumber;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArgumentsItem{

	@JsonProperty("val")
	private String val;

	@JsonProperty("offset")
	private Integer offset;
}