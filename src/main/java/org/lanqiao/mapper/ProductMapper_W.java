package org.lanqiao.mapper;

import org.lanqiao.entity.Product_W;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper_W {
    int deleteByPrimaryKey(Integer proId);

    int insert(Product_W record);

    int insertSelective(Product_W record);

    Product_W selectByPrimaryKey(Integer proId);

    int updateByPrimaryKeySelective(Product_W record);

    int updateByPrimaryKey(Product_W record);
}