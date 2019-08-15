package org.lanqiao.mapper;

import org.lanqiao.entity.ProductSort;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSortMapperZ {
    int deleteByPrimaryKey(Integer sortId);

    int insert(ProductSort record);

    int selectBySortName(String  SortName);

    int insertSelective(ProductSort record);

    ProductSort selectByPrimaryKey(Integer sortId);

    int updateByPrimaryKeySelective(ProductSort record);

    int updateByPrimaryKey(ProductSort record);
}