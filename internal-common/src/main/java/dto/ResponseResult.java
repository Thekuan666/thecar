package dto;

import constant.CommonstatusEnum;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @ Auther: yk
 * @ Date: 2023/2/15 - 02 - 15 - 15:46
 * @ Description: dto
 * @ version: 1.0
 */
@Data
@Accessors(chain = true)
public class ResponseResult<T> {
    private int code;
    private String message;
    private T data;

    /**
     * 成功的返回值
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseResult success(T data){
        return new ResponseResult().setCode(CommonstatusEnum.SUCCESS.getCode()).setMessage(CommonstatusEnum.SUCCESS.getValue()).setData(data);
    }

    /**
     * 失败： 自定义 code message
     * @param code
     * @param message
     * @return
     */
    public static ResponseResult fail(int code, String message){
        return new ResponseResult().setCode(code).setMessage(message);
    }
    /**
     * 失败： 自定义 code message data 其中data为返回的值 用string
     * @param code
     * @param message
     * @return
     */
    public static ResponseResult fail(int code, String message, String data){
        return new ResponseResult().setCode(code).setMessage(message).setData(data);
    }
    /**
     * 失败：默认

     * @return
     */
    public static <T> ResponseResult fail(T data){
        return new ResponseResult().setData(data);
    }
}
