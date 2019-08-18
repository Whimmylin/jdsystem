package org.lanqiao.mapper;

import org.lanqiao.entity.ProductImg;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImg_YMapper {
    int deleteByPrimaryKey(Integer imgId);

    int insert(ProductImg record);

    int insertSelective(ProductImg record);

    ProductImg selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(ProductImg record);

    int updateByPrimaryKey(ProductImg record);
}