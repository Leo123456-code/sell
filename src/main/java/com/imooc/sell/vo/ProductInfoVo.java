package com.imooc.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-3:00
 * email 1437665365@qq.com
 */
@Data
public class ProductInfoVo {

    //返回给前端的名字 id
    @JsonProperty("id")
    private String productId;
    //返回给前端的名字 name
    @JsonProperty("name")
    private String productName;
    @JsonProperty("price")
    private BigDecimal productPrice;
    @JsonProperty("description")
    private String productDescription;
    @JsonProperty("icon")
    private String productIcon;
}
