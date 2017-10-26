package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * Created by sunzhenzhou on 2017/10/25.
 */
public class SellException extends RuntimeException {

    private Integer code;

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
