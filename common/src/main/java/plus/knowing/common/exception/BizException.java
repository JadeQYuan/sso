package plus.knowing.common.exception;

import lombok.Getter;
import plus.knowing.common.response.ResponseInstance;

@Getter
public class BizException extends BaseException {

    BizException(ResponseInstance responseInstance) {
        super(responseInstance);
    }

    BizException(ResponseInstance responseInstance, String errMessage) {
        super(responseInstance, errMessage);
    }

    BizException(ResponseInstance responseInstance, Throwable cause) {
        super(responseInstance, cause);
    }
}
