package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by sunzhenzhou on 2017/10/18.
 */
@Entity
@Data
public class SellerInfo {

    @Id
    private String sellerId;        //卖家ID

    private String username;        //卖家姓名

    private String password;        //卖家密码

    private String openid;          //卖家openid

    private Date createTime;        //创建时间

    private Date updateTime;        //更新时间

    public SellerInfo() {
    }
}
