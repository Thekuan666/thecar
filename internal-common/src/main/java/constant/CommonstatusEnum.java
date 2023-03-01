package constant;


import lombok.Getter;
import lombok.Setter;

/**
 * @ Auther: yk
 * @ Date: 2023/2/15 - 02 - 15 - 15:25
 * @ Description: constant
 * @ version: 1.0
 */
public enum CommonstatusEnum {
    /*
    成功
     */
    SUCCESS(1,"success"),
    FAIL(0,"fail");
    @Getter
    @Setter
    private  int code;
    @Getter
    @Setter
    private  String value;

    CommonstatusEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }


}
