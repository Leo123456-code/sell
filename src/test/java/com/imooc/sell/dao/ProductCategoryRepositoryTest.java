package com.imooc.sell.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.imooc.sell.SellApplicationTests;
import com.imooc.sell.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2020/1/8-23:23
 * email 1437665365@qq.com
 */
@Slf4j
public class ProductCategoryRepositoryTest
        extends SellApplicationTests {
    @Autowired
    private ProductCategoryRepository repository;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(1);
        log.info("productCategory={}",gson.toJson(productCategory));
    }

    @Test
    public void  findAll(){
        List<ProductCategory> list= repository.findAll();
        log.info("list={}",gson.toJson(list));
    }

    @Test
    public void save(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女生最强");
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }

    @Test
    public void update(){
        ProductCategory r = repository.findOne(3);
        r.setCategoryName("慕课网");
        r.setCategoryType(50);
        ProductCategory rep = repository.save(r);
        log.info("result={}",gson.toJson(rep));
    }

    @Test
    public void delete(){
        repository.delete(2);
    }
    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list= Arrays.asList(1,50);
        List<ProductCategory> categories =
                repository.findByCategoryTypeIn(list);
        log.info("result={}",gson.toJson(categories));
        Assert.assertNotEquals(0,categories.size());

    }
}