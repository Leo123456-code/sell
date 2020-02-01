package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-5:58
 * email 1437665365@qq.com
 */
public interface OrderService {
    //创建订单
    OrderDTo create(OrderDTo orderDTo);
    //查询单个订单
    OrderDTo findOne(String orderId);
    //查询订单列表
    Page<OrderDTo> findList(String buyerOpenid, Pageable pageable);
    //取消订单
    OrderDTo cancel(OrderDTo orderDTo);
    //完成订单
    OrderDTo finished(OrderDTo orderDTo);
    //支付订单
    OrderDTo paid(OrderDTo orderDTo);

}
