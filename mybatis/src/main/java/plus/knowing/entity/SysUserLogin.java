package plus.knowing.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * sys_user_login
 *
 * @author
 */
@Data
public class SysUserLogin implements Serializable {
    private Long id;

    private Long userId;

    /**
     * 登录时间
     */
    private LocalDateTime loginTime;

    private static final long serialVersionUID = 1L;
}
