package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by sunzhenzhou on 2017/10/19.
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo ,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
