package plus.knowing.oss.chat.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import plus.knowing.oss.chat.entity.SysUser;

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
