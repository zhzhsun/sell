package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

/**
 * Created by sunzhenzhou on 2017/10/19.
 * 买家 dao
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String>{

    List<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
