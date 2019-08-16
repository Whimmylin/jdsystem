package org.lanqiao.mapper;

import org.lanqiao.entity.ProductSort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductSortMapperZ {

    int deleteByPrimaryKey(Integer sortId);

    int insert(ProductSort record);

    int selectBySortName(String  SortName);

    int insertSelective(ProductSort record);

    ProductSort selectByPrimaryKey(Integer sortId);

    List<ProductSort> showProSortList(int pageNum,int pageSize);

    int updateByPrimaryKeySelective(ProductSort record);

    int updateByPrimaryKey(ProductSort record);

    List<ProductSort> sort2PageCount();


}