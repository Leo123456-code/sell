package com.imooc.sell.dao;

import com.imooc.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-5:04
 * email 1437665365@qq.com
 */
public interface OrderDetailRepository
        extends JpaRepository<OrderDetail,String> {
    List<OrderDetail> findByOrderId(String orderId);
}
