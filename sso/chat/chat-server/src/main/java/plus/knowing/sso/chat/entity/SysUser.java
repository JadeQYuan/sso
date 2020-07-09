package plus.knowing.sso.chat.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SysUser {

    private Long id;

    private Long casId;

    private String name;

    private String role;
}
