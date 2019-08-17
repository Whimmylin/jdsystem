package org.lanqiao.service;

import org.lanqiao.entity.Cart;
import org.springframework.stereotype.Service;

@Service
public interface CartServiceLL {
    public int insert(Cart record);
    public Cart selectByPrimaryKey(Integer cartId);
    public int selectByUserId(Integer userId);
}
