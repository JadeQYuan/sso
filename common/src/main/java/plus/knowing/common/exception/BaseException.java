package plus.knowing.common.exception;

import lombok.Getter;
import plus.knowing.common.response.ResponseInstance;

@Getter
public class BaseException extends RuntimeException {

    private final Integer errCode;

    private final String errMessage;

    BaseException(ResponseInstance responseInstance) {
        super(responseInstance.getMessage());
        this.errCode = responseInstance.getCode();
        this.errMessage = responseInstance.getMessage();
    }

    BaseException(ResponseInstance responseInstance, String errMessage) {
        super(errMessage);
        this.errCode = responseInstance.getCode();
        this.errMessage = errMessage;
    }

    BaseException(ResponseInstance responseInstance, Throwable cause) {
        super(responseInstance.getMessage(), cause);
        this.errCode = responseInstance.getCode();
        this.errMessage = responseInstance.getMessage();
    }
}
