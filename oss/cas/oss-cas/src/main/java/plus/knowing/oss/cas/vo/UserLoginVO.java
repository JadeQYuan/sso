package plus.knowing.oss.cas.vo;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class UserLoginVO {

    @NotBlank
    private String mobile;

    @NotBlank
    private String password;
}
