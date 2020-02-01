package com.imooc.sell.enums;

import lombok.Getter;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-4:50
 * email 1437665365@qq.com
 */
@Getter
public enum PayStatusEnum {

    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;
    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
