package plus.knowing.oss.cas.vo;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TokenVO {

    private String token;

    private LocalDateTime expireTime;
}
