package org.lanqiao.mapper;

import org.lanqiao.entity.ProductSort_H;

public interface ProductSortMapper_H {
    int deleteByPrimaryKey(Integer sortId);

    int insert(ProductSort_H record);

    int insertSelective(ProductSort_H record);

    ProductSort_H selectByPrimaryKey(Integer sortId);

    int updateByPrimaryKeySelective(ProductSort_H record);

    int updateByPrimaryKey(ProductSort_H record);
}