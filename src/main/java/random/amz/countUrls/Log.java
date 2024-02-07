package random.amz.countUrls;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Log {
    private Long customerId;
    private String url;
    private LocalDateTime date;
}
