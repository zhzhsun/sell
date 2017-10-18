package com.imooc.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.utils.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by sunzhenzhou on 2017/10/18.
 * 商品信息
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    @Id
    private String productId;       //ID

    private String productName;     //名字

    private BigDecimal productPrice;        //单价

    private Integer productStock;           //库存

    private String productDescription;      //描述

    private String productIcon;             //小图

    private Integer productStatus = ProductStatusEnum.UP.getCode();             //状态，0正常1下架

    private Integer categoryType;               //类目编号

    private Date createTime;                    //创建时间

    private Date updateTime;                    //更新时间

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum(){
        return EnumUtil.getByCode(productStatus,ProductStatusEnum.class);
    }

}
