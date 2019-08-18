package org.lanqiao.service;

import org.lanqiao.entity.Cart;
import org.lanqiao.mapper.CartMapperLL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImplLL implements CartServiceLL {
   @Autowired
   CartMapperLL cartMapper;

    @Override
    public int insert(Cart record) {
        return cartMapper.insert(record);
    }

    @Override
    public Cart selectByPrimaryKey(Integer cartId) {
        return cartMapper.selectByPrimaryKey(cartId);
    }

    @Override
    public int selectByUserId(Integer userId) {
        return cartMapper.selectByUserId(userId);
    }
}
