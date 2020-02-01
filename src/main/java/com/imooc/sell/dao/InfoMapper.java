package com.imooc.sell.dao;

import com.imooc.sell.pojo.Info;

public interface InfoMapper {
    int deleteByPrimaryKey(String productId);

    int insert(Info record);

    int insertSelective(Info record);

    Info selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);
}