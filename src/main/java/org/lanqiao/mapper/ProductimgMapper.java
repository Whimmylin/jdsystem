package org.lanqiao.mapper;

import org.lanqiao.entity.ProductImg;

public interface ProductimgMapper {
    int deleteByPrimaryKey(Integer imgId);

    int insert(ProductImg record);

    int insertSelective(ProductImg record);

    ProductImg selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(ProductImg record);

    int updateByPrimaryKey(ProductImg record);
}