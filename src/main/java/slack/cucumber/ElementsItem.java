package slack.cucumber;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ElementsItem{

	@JsonProperty("start_timestamp")
	private String startTimestamp;

	@JsonProperty("before")
	private List<BeforeItem> before;

	@JsonProperty("line")
	private Integer line;

	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	@JsonProperty("id")
	private String id;

	@JsonProperty("after")
	private List<AfterItem> after;

	@JsonProperty("type")
	private String type;

	@JsonProperty("keyword")
	private String keyword;

	@JsonProperty("steps")
	private List<StepsItem> steps;

	@JsonProperty("tags")
	private List<TagsItem> tags;
}