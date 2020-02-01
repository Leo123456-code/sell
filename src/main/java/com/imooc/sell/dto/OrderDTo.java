package com.imooc.sell.dto;

import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-6:03
 * email 1437665365@qq.com
 */
@Data
public class OrderDTo {

    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;
    //默认新订单
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    //默认未支付
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    private Date createTime;

    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}
