package org.lanqiao.mapper;

import org.lanqiao.entity.ProductLL;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapperLL {
    //int deleteByPrimaryKey(Integer proId);

   // int insert(ProductLL record);

    //int insertSelective(ProductLL record);

    ProductLL selectByPrimaryKey(Integer proId);

   // int updateByPrimaryKeySelective(ProductLL record);

    //int updateByPrimaryKey(ProductLL record);
}