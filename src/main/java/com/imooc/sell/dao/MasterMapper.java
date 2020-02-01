package com.imooc.sell.dao;

import com.imooc.sell.pojo.Master;

public interface MasterMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Master record);

    int insertSelective(Master record);

    Master selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Master record);

    int updateByPrimaryKey(Master record);
}