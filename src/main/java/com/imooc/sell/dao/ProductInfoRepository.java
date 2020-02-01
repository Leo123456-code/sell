package com.imooc.sell.dao;

import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-1:41
 * email 1437665365@qq.com
 */
public interface ProductInfoRepository extends
        JpaRepository<ProductInfo,String> {
    //根据状态查询商品信息
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
