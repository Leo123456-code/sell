package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-1:02
 * email 1437665365@qq.com
 */

public interface CategoryService {
    //根据id查询
    ProductCategory findOne(Integer categoryId);
    //查询所有
    List<ProductCategory> findAll();
   //根据很多编号查询
    List<ProductCategory> findByCateGoryTypeIn
            (List<Integer> categoryTypeList);
    //新增和修改
    ProductCategory save(ProductCategory productCategory);
}
