package org.lanqiao.mapper;

import org.lanqiao.entity.Key;
import org.lanqiao.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper_H {
    int deleteByPrimaryKey(Integer proId);

    int insert(Product record);

    int insertSelective(Product record);

    List selectByPrimaryKey(Key key);
   //Integer proId
    List FY(Key key);

    int Count(Key key);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}