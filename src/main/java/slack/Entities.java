package slack;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Entities {

    List<Attachment> attachments;
    String channel;
}
