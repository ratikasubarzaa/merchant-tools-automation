package slack.cucumber;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestItem {

	@JsonProperty("line")
	private Integer line;

	@JsonProperty("elements")
	private List<ElementsItem> elements;

	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	@JsonProperty("id")
	private String id;

	@JsonProperty("keyword")
	private String keyword;

	@JsonProperty("uri")
	private String uri;

	@JsonProperty("tags")
	private List<TagsItem> tags;
}