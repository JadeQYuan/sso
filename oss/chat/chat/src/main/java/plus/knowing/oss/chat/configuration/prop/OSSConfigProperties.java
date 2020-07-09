package plus.knowing.oss.chat.configuration.prop;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "oss")
public class OSSConfigProperties {

    private String authUrl;
}
