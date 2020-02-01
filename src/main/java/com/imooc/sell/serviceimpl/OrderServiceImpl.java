package com.imooc.sell.serviceimpl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.imooc.sell.dao.OrderDetailRepository;
import com.imooc.sell.dao.OrderMasterRepository;
import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.dto.OrderDTo;
import com.imooc.sell.service.OrderService;
import com.imooc.sell.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-6:09
 * email 1437665365@qq.com
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMasterRepository masterRepository;
    @Autowired
    private OrderDetailRepository detailRepository;
    @Autowired
    private ProductService productService;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public OrderDTo create(OrderDTo orderDTo) {
        //查询商品（数量,价格)
        for (OrderDetail orderDetail : orderDTo.getOrderDetailList()) {
            ProductInfo productInfo =
                    productService.findOne(orderDetail.getProductId());
        }
        //计算总价
        //写入数据库（orderMaster,orderDetail）
        //扣库存


        return null;
    }

    @Override
    public OrderDTo findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTo> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTo cancel(OrderDTo orderDTo) {
        return null;
    }

    @Override
    public OrderDTo finished(OrderDTo orderDTo) {
        return null;
    }

    @Override
    public OrderDTo paid(OrderDTo orderDTo) {
        return null;
    }
}
