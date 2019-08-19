package org.lanqiao.mapper;

import org.lanqiao.entity.ProductSort;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSortMapperLL {
//    int deleteByPrimaryKey(Integer sortId);
//
//    int insert(ProductSort record);
//
//    int insertSelective(ProductSort record);

    ProductSort selectByPrimaryKey(Integer sortId);

//    int updateByPrimaryKeySelective(ProductSort record);
//
//    int updateByPrimaryKey(ProductSort record);
}