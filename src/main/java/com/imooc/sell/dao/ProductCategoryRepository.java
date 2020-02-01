package com.imooc.sell.dao;

/**
 * created by Leo徐忠春
 * created Time 2020/1/8-23:20
 * email 1437665365@qq.com
 */


import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Category类目的mapper文件
 * JpaRepository<ProductCategory,Integer>
 *     Integer是主键的类型
 */

public interface ProductCategoryRepository extends
        JpaRepository<ProductCategory,Integer> {
    //根据Type查询列表
    List<ProductCategory> findByCategoryTypeIn(List<Integer>
                                                       categoryTypeList);

}
