package org.lanqiao.mapper;

import org.lanqiao.entity.Cart;
import org.springframework.stereotype.Repository;

@Repository
public interface CartMapperLL {
//    int deleteByPrimaryKey(Integer cartId);

      int insert(Cart record);

//    int insertSelective(Cart record);

      Cart selectByPrimaryKey(Integer cartId);

      int selectByUserId(Integer userId);

//    int updateByPrimaryKeySelective(Cart record);
//
//    int updateByPrimaryKey(Cart record);
}