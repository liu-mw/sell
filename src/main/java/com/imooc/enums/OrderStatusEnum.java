package com.imooc.enums;

import lombok.Getter;

/**
 * @author liumw
 * @date 2017/11/12 15:56
 */
@Getter//用于获取set好的值
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}