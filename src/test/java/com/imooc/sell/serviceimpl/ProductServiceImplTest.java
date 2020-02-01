package com.imooc.sell.serviceimpl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.imooc.sell.SellApplicationTests;
import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-2:14
 * email 1437665365@qq.com
 */
@Service
@Slf4j
public class ProductServiceImplTest extends SellApplicationTests {
    @Autowired
    private ProductService productService;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @Test
    public void findOne() {
        ProductInfo p = productService.findOne("1587945");
        log.info("result={}",gson.toJson(p));
        Assert.assertNotNull(p);
    }

    @Test
    public void findAll() {
        List<ProductInfo> list = productService.findAll();
        log.info("result={}",gson.toJson(list));
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void testFindAll() {
        PageRequest pageRequest = new PageRequest(1,2);
        Page<ProductInfo> all = productService.findAll(pageRequest);
        log.info("result={}",all.getTotalElements());//结果总数

    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("188888888");
        productInfo.setProductName("木须肉");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃的");
        productInfo.setProductIcon("http://baidu123.com");
        productInfo.setProductStatus(1);
        productInfo.setCategoryType(2);
        ProductInfo info = productService.save(productInfo);
        log.info("result={}",gson.toJson(info));

    }
}