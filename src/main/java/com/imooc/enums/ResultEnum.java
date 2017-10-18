package com.imooc.enums;

import lombok.Getter;

/**
 * Created by sunzhenzhou on 2017/10/18.
 */
@Getter
public enum ResultEnum {

    SUCCESS(0,"成功"),

    PARAM_ERROR(1,"参数不正确")
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
