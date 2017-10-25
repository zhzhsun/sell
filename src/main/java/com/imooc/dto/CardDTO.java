package com.imooc.dto;

import lombok.Data;

/**
 * Created by sunzhenzhou on 2017/10/25.
 * 购物车
 */
@Data
public class CardDTO {

    private String productId;       //商品ID

    private Integer productQuantity;        //数量

    public CardDTO() {
    }

    public CardDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
