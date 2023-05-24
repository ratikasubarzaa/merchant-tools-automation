package slack.cucumber;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Match{

	@JsonProperty("location")
	private String location;

	@JsonProperty("arguments")
	private List<ArgumentsItem> arguments;
}