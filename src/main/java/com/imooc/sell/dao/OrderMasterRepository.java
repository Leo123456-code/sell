package com.imooc.sell.dao;

import com.imooc.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 * created by Leo徐忠春
 * created Time 2020/1/9-4:59
 * email 1437665365@qq.com
 */

public interface OrderMasterRepository
        extends JpaRepository<OrderMaster,String> {
    //分页查询(根据买家的openid来查
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid,
                                        Pageable pageable);
}
