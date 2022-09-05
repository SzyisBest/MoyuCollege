package college.moyu.exception;

import college.moyu.enums.StatusCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static college.moyu.enums.StatusCodeEnum.FAIL;

/**
 * @author 古丶野
 * @version 1.0
 * @project MoyuCollege
 * @description 业务异常
 * @date 2022/9/6 00:49:58
 */
@Getter
@AllArgsConstructor
public class MoYuException extends RuntimeException{
    /**
     * 错误码
     */
    private Integer code = FAIL.getCode();

    /**
     * 错误信息
     */
    private final String message;

    public MoYuException(String message) {
        this.message = message;
    }

    public MoYuException(StatusCodeEnum statusCodeEnum) {
        this.code = statusCodeEnum.getCode();
        this.message = statusCodeEnum.getDesc();
    }
}
