package plus.knowing.sso.cas.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CasUser {

    private Long id;

    private String name;

    private String mobile;

    private String password;
}
