package org.lanqiao.mapper;

import org.lanqiao.entity.ProductBrand;

public interface ProductBrandMapper_Y {
    int deleteByPrimaryKey(Integer brandId);

    int insert(ProductBrand record);

    int insertSelective(ProductBrand record);

    ProductBrand selectByPrimaryKey(Integer brandId);

    int updateByPrimaryKeySelective(ProductBrand record);

    int updateByPrimaryKey(ProductBrand record);
}