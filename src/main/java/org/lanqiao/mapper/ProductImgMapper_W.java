package org.lanqiao.mapper;

import org.lanqiao.entity.ProductImg_W;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImgMapper_W {
    int deleteByPrimaryKey(Integer imgId);

    int insert(ProductImg_W record);

    int insertSelective(ProductImg_W record);

    ProductImg_W selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(ProductImg_W record);

    int updateByPrimaryKey(ProductImg_W record);
}