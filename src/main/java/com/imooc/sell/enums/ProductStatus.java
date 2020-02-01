package com.imooc.sell.enums;

import lombok.Getter;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-2:06
 * email 1437665365@qq.com
 */
@Getter
public enum ProductStatus {
    UP(0,"上架"),
    DOWN(1,"下架"),
    ;

    private Integer code;
    private String message;


    ProductStatus(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}
