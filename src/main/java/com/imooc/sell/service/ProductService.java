package com.imooc.sell.service;


import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-1:57
 * email 1437665365@qq.com
 */
public interface ProductService {

    ProductInfo findOne(String productId);
    /**
     * 查询所有在架商品
     */
    List<ProductInfo> findAll();
    //
    Page<ProductInfo> findAll(Pageable pageable);
    //新增
    ProductInfo save(ProductInfo productInfo);
    //加库存

    //减库存

 }
