package org.lanqiao.mapper;

import org.lanqiao.entity.ProductSort;

public interface ProductSortMapper_H {
    int deleteByPrimaryKey(Integer sortId);

    int insert(ProductSort record);

    int insertSelective(ProductSort record);

    ProductSort selectByPrimaryKey(Integer sortId);

    int updateByPrimaryKeySelective(ProductSort record);

    int updateByPrimaryKey(ProductSort record);
}