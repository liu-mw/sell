package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

/**
 * @author liumw
 * @date 2017/11/11 18:21
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(org.springframework.data.domain.Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
//    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
//    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
//    ProductInfo onSale(String productId);

    //下架
//    ProductInfo offSale(String productId);
}
