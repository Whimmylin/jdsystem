package org.lanqiao.mapper;

import org.lanqiao.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper_W {
    int deleteByPrimaryKey(Integer proId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer proId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}