package plus.knowing.sso.cas.exception;

import lombok.Getter;
import plus.knowing.common.exception.BizAssert;

@Getter
public enum BizResponseEnum implements BizAssert {

    LOGIN_INVALID(10001, "用户名或密码不正确！"),
    TOKEN_INVALID(10002, "无效的token！"),
    ;

    BizResponseEnum(Integer errCode, String errMessage) {
        this.code = errCode;
        this.message = errMessage;
    }

    private final Integer code;

    private final String message;
}
