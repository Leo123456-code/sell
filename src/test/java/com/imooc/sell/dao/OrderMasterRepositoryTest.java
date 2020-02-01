package com.imooc.sell.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.imooc.sell.SellApplicationTests;
import com.imooc.sell.dataobject.OrderMaster;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.math.BigDecimal;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-5:09
 * email 1437665365@qq.com
 */
@Slf4j
public class OrderMasterRepositoryTest extends SellApplicationTests {
    @Autowired
    private OrderMasterRepository repository;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void save(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setBuyerAddress("湖北");
        orderMaster.setBuyerName("王菲");
        orderMaster.setBuyerOpenid("122233");
        orderMaster.setBuyerPhone("1613132");
        orderMaster.setOrderAmount(new BigDecimal(3.55));
        orderMaster.setOrderStatus(1);
        orderMaster.setPayStatus(0);
        orderMaster.setOrderId("1646");
        OrderMaster master = repository.save(orderMaster);
        log.info("master={}",gson.toJson(master));
        Assert.assertNotNull(master);
    }
    @Test
    public void findByBuyerOpenid() {
        PageRequest pageRequest = new PageRequest(0, 1);
        Page<OrderMaster> result =
                repository.findByBuyerOpenid("110110", pageRequest);
        log.info("result={}",gson.toJson(result));

    }
}