package com.imooc.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import com.imooc.utils.serializer.Date2LongSerializer;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sunzhenzhou on 2017/10/25.
 */
@Data
public class OrderDTO {

    @Id
    private String orderId;         //订单ID

    private String buyerName;       //买家名字

    private String buyerPhone;      //买家手机号

    private String buyerAddress;        //买家地址

    private String buyerOpenid;         //买家微信openid

    private BigDecimal orderAmount;     //订单总金额

    private Integer orderStatus;        //订单状态，默认为0新下单

    private Integer payStatus;           //支付状态，默认为0未支付

    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;            //创建时间

    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;            //更新时间

    List<OrderDetail> orderDetailList;

}
