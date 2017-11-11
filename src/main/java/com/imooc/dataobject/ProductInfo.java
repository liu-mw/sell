package com.imooc.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imooc.enums.ProductStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liumw
 * @date 2017/11/11 18:03
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {
    @Id//数据库中改字段并不是自增的`product_id` varchar(32) NOT NULL,所以不用加@geneual
    private String productId;

    /** 名字. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 状态, 0正常1下架. */
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

//    @JsonIgnore
//    public ProductStatusEnum getProductStatusEnum() {
//        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
//    }
}
