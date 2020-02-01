package com.imooc.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-2:52
 * email 1437665365@qq.com
 */

/**
 * 商品(包含类目)
 */
@Data
public class ProductVo {

     //热榜
    //返回给前端的名字是 name
    @JsonProperty("name")
    private String categoryName;
    //商品类别
    @JsonProperty("type")
    private Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVo> productInfoVoList;
}
