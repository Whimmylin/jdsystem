package org.lanqiao.mapper;

import org.lanqiao.entity.Product_Y;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper_Y {
    int deleteByPrimaryKey(Integer proId);

    int insert(Product_Y productY);

    int insertSelective(Product_Y record);

    List<Product_Y> selectByPrimaryKey(int pageNum,int pageSize);

    List<Product_Y> count();

    public  List<Product_Y> selectProductOne(int indexId);

    int updateByPrimaryKeySelective(Product_Y record);

    int updateByPrimaryKey(Product_Y record);
}