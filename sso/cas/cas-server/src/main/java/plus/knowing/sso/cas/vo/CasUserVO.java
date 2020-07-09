package plus.knowing.sso.cas.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import plus.knowing.sso.cas.entity.CasUser;

@Getter
@Setter
@NoArgsConstructor
public class CasUserVO {

    private Long id;

    private String name;

    private String mobile;

    public CasUserVO(CasUser casUser) {
        this.id = casUser.getId();
        this.name = casUser.getName();
        this.mobile = casUser.getMobile();
    }
}
