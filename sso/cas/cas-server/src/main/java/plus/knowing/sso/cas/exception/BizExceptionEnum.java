package plus.knowing.sso.cas.exception;

import lombok.Getter;
import plus.knowing.common.exception.BizAssert;

@Getter
public enum BizExceptionEnum implements BizAssert {

    LOGIN_INVALID(10001, "用户名或密码不正确！"),
    TOKEN_INVALID(10002, "无效的token！"),
    ;

    BizExceptionEnum(Integer errCode, String errMessage) {
        this.errCode = errCode;
        this.errMessage = errMessage;
    }

    private final Integer errCode;

    private final String errMessage;
}
