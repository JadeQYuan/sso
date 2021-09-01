package plus.knowing.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * sys_user
 *
 * @author
 */
@Data
public class SysUser implements Serializable {
    private Long id;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    private String name;

    private String wxId;

    private String wxUnionId;

    /**
     * 角色
     */
    private String role;

    private String code;

    private LocalDateTime createTime;

    private String password;

    private static final long serialVersionUID = 1L;
}
