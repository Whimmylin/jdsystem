package org.lanqiao.mapper;

import org.lanqiao.entity.Product_G;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer proId);

    int insert(Product_G record);

    int insertSelective(Product_G record);

    Product_G selectByPrimaryKey(Integer proId);

    int updateByPrimaryKeySelective(Product_G record);

    int updateByPrimaryKey(Product_G record);
}