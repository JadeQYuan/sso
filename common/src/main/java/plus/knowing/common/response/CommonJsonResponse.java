package plus.knowing.common.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@SuppressWarnings("serial")
@NoArgsConstructor
@Getter
@ToString
public class CommonJsonResponse<T> implements Serializable {

    private Integer code;

    private String message;

    private T data;

    /**
     * 构造一个没有数据的消息
     */
    private CommonJsonResponse(ResponseConstEnum respConst) {
        this.code = respConst.getCode();
        this.message = respConst.getMsg();
    }

    /**
     * 构造成功返回数据对象
     */
    private CommonJsonResponse(T data) {
        this.code = ResponseConstEnum.SUCCESS.getCode();
        this.message = ResponseConstEnum.SUCCESS.getMsg();
        this.data = data;
    }

    public CommonJsonResponse(int code, String msg) {
        this.code = code;
        this.message = msg;
    }

    /**
     * 返回通用成功对象
     */
    public static <T> CommonJsonResponse<T> newSuccessResponse() {
        return new CommonJsonResponse<>(ResponseConstEnum.SUCCESS);
    }

    /**
     * 成功返回数据对象
     */
    public static <T> CommonJsonResponse<T> newSuccessResponse(T data) {
        return new CommonJsonResponse<>(data);
    }

    /**
     * 返回失败对象
     */
    public static <T> CommonJsonResponse<T> newFailedResponse(String message) {
        return new CommonJsonResponse<>(ResponseConstEnum.FAILED.getCode(), message);
    }

    /**
     * 返回通用异常对象
     */
    public static <T> CommonJsonResponse<T> newErrorResponse() {
        return new CommonJsonResponse<>(ResponseConstEnum.ERROR);
    }

    public static <T> CommonJsonResponse<T> newErrorResponse(int code, String msg) {
        return new CommonJsonResponse<>(code, msg);
    }
}
