package com.imooc.sell.enums;

import lombok.Getter;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-4:44
 * email 1437665365@qq.com
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完成"),
    CANNAL(2,"已取消"),
    ;
    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
