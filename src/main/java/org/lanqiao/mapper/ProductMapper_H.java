package org.lanqiao.mapper;

import org.lanqiao.entity.Key;
import org.lanqiao.entity.Product_H;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper_H {
    int deleteByPrimaryKey(Integer proId);

    int insert(Product_H record);

    int insertSelective(Product_H record);

    List selectByPrimaryKey(Key key);
   //Integer proId
    List FY(Key key);

    int Count(Key key);

    int updateByPrimaryKeySelective(Product_H record);

    int updateByPrimaryKey(Product_H record);
}