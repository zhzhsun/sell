package com.imooc.enums;


import lombok.Getter;

/**
 * Created by sunzhenzhou on 2017/10/18.
 * 订单状态
 */
@Getter
public enum OrderStatusEnum implements CodeEnum{

    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"取消");

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
