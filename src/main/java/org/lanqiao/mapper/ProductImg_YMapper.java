package org.lanqiao.mapper;

import org.lanqiao.entity.ProductImg_Y;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImg_YMapper {
    int deleteByPrimaryKey(Integer imgId);

    int insert(ProductImg_Y record);

    int insertSelective(ProductImg_Y record);

    ProductImg_Y selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(ProductImg_Y record);

    int updateByPrimaryKey(ProductImg_Y record);
}