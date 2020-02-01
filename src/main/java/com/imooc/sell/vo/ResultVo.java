package com.imooc.sell.vo;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-0:42
 * email 1437665365@qq.com
 */

import lombok.Data;

/**
 * Http请求返回的最外层对象
 */
@Data
public class ResultVo<T> {
    //错误码
    private Integer code;
    //提示信息
    private String msg;
    //具体内容
    private T data;

//    public ResultVo(Integer code){
//        this.code = code;
//    }
//    public ResultVo(Integer code, String msg){
//        this.code = code;
//        this.msg = msg;
//    }



}
