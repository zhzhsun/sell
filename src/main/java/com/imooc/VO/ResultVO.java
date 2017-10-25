package com.imooc.VO;

import lombok.Data;

/**
 * Created by sunzhenzhou on 2017/10/25.
 * http请求返回的最外层对象
 */
@Data
public class ResultVO<T> {

    private Integer code;           //错误码

    private String msg;             //提示信息

    private T data;                 //具体内容
}
