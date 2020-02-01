package com.imooc.sell.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.imooc.sell.SellApplicationTests;
import com.imooc.sell.dataobject.OrderDetail;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-5:52
 * email 1437665365@qq.com
 */
@Slf4j
public class OrderDetailRepositoryTest extends SellApplicationTests {
    @Autowired
    private OrderDetailRepository repository;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetails = repository.findByOrderId("123456");
        log.info("result={}",gson.toJson(orderDetails));
        Assert.assertNotNull(orderDetails);
    }
}