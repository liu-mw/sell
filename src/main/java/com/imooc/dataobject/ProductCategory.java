package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author liumw
 * @date 2017/11/11 15:20
 * 假如有：数据库表是：s_product_category
 */
//@Table(name="s_product_category")
//实际上表是product_category所以不用写table让其默认
@Entity    //数据映射成对象
@DynamicUpdate   //让数据变更后，自动修改时间
@Data   //这个就不用再写set,get方法
public class ProductCategory {
    /** 类目id. */
    @Id
    @GeneratedValue//让其自增
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号.业务变更把类型变成String类型，又要变更set,get方法，麻烦用注解@Data,
     * jar包是lombok 该插件需要自己导入
     *
     */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
