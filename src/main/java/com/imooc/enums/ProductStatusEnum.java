package com.imooc.enums;

import lombok.Getter;

/**
 * @author liumw
 * @date 2017/11/11 18:06
 */
@Getter
public enum ProductStatusEnum implements CodeEnum{
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

}
