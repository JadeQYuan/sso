package plus.knowing.common.response;

import lombok.Getter;

@Getter
public enum ResponseConstEnum {

    SUCCESS(200, "成功"),
    FAILED(400, "失败"),
    ERROR(500, "未知错误"),
    ;

    ResponseConstEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;

    private String msg;
}
