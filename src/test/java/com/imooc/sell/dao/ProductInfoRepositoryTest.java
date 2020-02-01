package com.imooc.sell.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.imooc.sell.SellApplicationTests;
import com.imooc.sell.dataobject.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-1:44
 * email 1437665365@qq.com
 */
@Slf4j
public class ProductInfoRepositoryTest
        extends SellApplicationTests {

    @Autowired
    private ProductInfoRepository repository;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void findByProductStatus() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1587945");
        productInfo.setProductName("桂花糕");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃的");
        productInfo.setProductIcon("http://baidu123.com");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);
        log.info("result={}",gson.toJson(result));
    }

    @Test
    public void  fdByProductStatus(){
        List<ProductInfo> list = repository.findByProductStatus(0);
        log.info("list={}",gson.toJson(list));
        Assert.assertNotEquals(0,list.size());

    }

}