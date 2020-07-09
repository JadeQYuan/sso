package plus.knowing.sso.chat.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import plus.knowing.sso.chat.entity.SysUser;

@Getter
@Setter
@NoArgsConstructor
public class UserVO {

    private Long id;

    private String name;

    private String role;

    public UserVO(SysUser sysUser) {
        this.id = sysUser.getId();
        this.name = sysUser.getName();
        this.role = sysUser.getRole();
    }
}
