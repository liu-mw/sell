package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import oracle.jrockit.jfr.StringConstantPool;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author liumw
 * @date 2017/11/11 18:16
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
