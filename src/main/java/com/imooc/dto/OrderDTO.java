package com.imooc.dto;

import lombok.Data;

/**
 * Created by sunzhenzhou on 2017/10/25.
 */
@Data
public class OrderDTO {

    private String orderId;         //订单ID

    private String buyerName;           // 买家名字

    private  String buyerPhone;         //买家手机号

    private String buyerAddress;        //买家地址



}
