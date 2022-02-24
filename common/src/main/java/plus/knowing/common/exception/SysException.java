package plus.knowing.common.exception;

import lombok.Getter;
import plus.knowing.common.response.ResponseInstance;

@Getter
public class SysException extends BaseException {

    SysException(ResponseInstance responseInstance) {
        super(responseInstance);
    }

    SysException(ResponseInstance responseInstance, String errMessage) {
        super(responseInstance, errMessage);
    }

    SysException(ResponseInstance responseInstance, Throwable cause) {
        super(responseInstance, cause);
    }
}
