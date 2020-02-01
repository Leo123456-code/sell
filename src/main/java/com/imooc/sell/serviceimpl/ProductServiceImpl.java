package com.imooc.sell.serviceimpl;

import com.imooc.sell.dao.ProductInfoRepository;
import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.enums.ProductStatus;
import com.imooc.sell.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * created by Leo徐忠春
 * created Time 2020/1/9-2:02
 * email 1437665365@qq.com
 */
@Slf4j
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {

        return repository.findOne(productId);
    }

    //查询上架的商品
    @Override
    public List<ProductInfo> findAll() {

        return repository.findByProductStatus(ProductStatus.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {

        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {

        return repository.save(productInfo);
    }
}
