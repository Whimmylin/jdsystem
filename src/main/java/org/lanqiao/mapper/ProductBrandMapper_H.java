package org.lanqiao.mapper;

import org.lanqiao.entity.ProductBrand_H;

public interface ProductBrandMapper_H {
    int deleteByPrimaryKey(Integer brandId);

    int insert(ProductBrand_H record);

    int insertSelective(ProductBrand_H record);

    ProductBrand_H selectByPrimaryKey(Integer brandId);

    int updateByPrimaryKeySelective(ProductBrand_H record);

    int updateByPrimaryKey(ProductBrand_H record);
}