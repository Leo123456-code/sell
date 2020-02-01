package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * created by Leo徐忠春
 * created Time 2020/1/9-1:36
 * email 1437665365@qq.com
 */
@Data
@Entity
@DynamicUpdate
@Table(name = "product_info")
public class ProductInfo {
    @Id
    private String productId;

    private String productName;
    //单价
    private BigDecimal productPrice;
    //库存
    private Integer productStock;
    //描述
    private String productDescription;
    //小图
    private String productIcon;
    //状态
    private Integer productStatus;
    //商品编号--关联类目
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

}
