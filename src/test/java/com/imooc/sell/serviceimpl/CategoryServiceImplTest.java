package com.imooc.sell.serviceimpl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.imooc.sell.SellApplicationTests;
import com.imooc.sell.dataobject.ProductCategory;
import com.imooc.sell.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-1:11
 * email 1437665365@qq.com
 */
@Slf4j
public class CategoryServiceImplTest extends SellApplicationTests {
    @Autowired
    private CategoryService categoryService;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void findOne() {
        ProductCategory p = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1),p.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> list = categoryService.findAll();
        log.info("list={}",gson.toJson(list));
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void findByCateGoryTypeIn() {
        List<Integer> list= Arrays.asList(1,50);
        List<ProductCategory> categories =
                categoryService.findByCateGoryTypeIn(list);
        log.info("list={}",gson.toJson(categories));
        Assert.assertNotEquals(0,categories.size());
    }

    @Test
    public void save() {
        ProductCategory category = new ProductCategory();
        category.setCategoryName("徐忠春");
        category.setCategoryType(2);
        ProductCategory p = categoryService.save(category);
        log.info("result={}",gson.toJson(p));
        ProductCategory result = categoryService.findOne(4);
        result.setCategoryName("汉武帝刘彻");
        result.setCategoryType(55);
        ProductCategory r = categoryService.save(result);
        log.info("result={}",gson.toJson(r));

    }
    @Test
    public void update() {
        ProductCategory result = categoryService.findOne(4);
        result.setCategoryName("汉武帝刘彻");
        result.setCategoryType(55);
        ProductCategory r = categoryService.save(result);
        log.info("result={}",gson.toJson(r));

    }
}