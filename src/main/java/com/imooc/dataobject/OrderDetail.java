package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by sunzhenzhou on 2017/10/18.
 */
@Entity
@Data
public class OrderDetail {

    @Id
    private String detailId;

    private String orderId;         //订单ID

    private String productId;       //商品ID

    private String productName;     //商品名称

    private BigDecimal productPrice;        //商品单价

    private Integer productQuantity;            //商品数量

    private String productIcon;                 //商品小图

    public OrderDetail() {
    }
}
