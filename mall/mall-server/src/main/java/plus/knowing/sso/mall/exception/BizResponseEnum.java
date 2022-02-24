package plus.knowing.sso.mall.exception;

import lombok.Getter;
import plus.knowing.common.exception.BizAssert;

@Getter
public enum BizResponseEnum implements BizAssert {

    NOT_LOGIN(10001, "未登录！"),
    ;

    BizResponseEnum(Integer errCode, String errMessage) {
        this.code = errCode;
        this.message = errMessage;
    }

    private final Integer code;

    private final String message;
}
