package org.lanqiao.mapper;

import org.lanqiao.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper_Y {
    int deleteByPrimaryKey(Integer proId);

    int insert(Product productY);

    int insertSelective(Product record);

    List<Product> selectByPrimaryKey(int pageNum, int pageSize);

    List<Product> count();

    public  List<Product> selectProductOne(int indexId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}