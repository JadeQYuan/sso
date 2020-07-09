package plus.knowing.sso.mall.exception;

import lombok.Getter;
import plus.knowing.common.exception.BizAssert;

@Getter
public enum BizExceptionEnum implements BizAssert {

    NOT_LOGIN(10001, "未登录！"),
    ;

    BizExceptionEnum(Integer errCode, String errMessage) {
        this.errCode = errCode;
        this.errMessage = errMessage;
    }

    private final Integer errCode;

    private final String errMessage;
}
