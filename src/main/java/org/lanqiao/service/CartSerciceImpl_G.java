package org.lanqiao.service;

import org.lanqiao.entity.Cart;
import org.lanqiao.entity.Orderdetail;
import org.lanqiao.entity.Orders;
import org.lanqiao.mapper.CartMapper_G;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CartSerciceImpl_G implements CartService_G {
    @Autowired
    CartMapper_G cartMapperG;
    @Override
    public List<Cart> selectAllCartGoods(Integer userId) {
        return cartMapperG.selectAllCartGoods(userId);
    }

    @Override
    public int deleteByPrimaryKey(Integer cartId) {
        return cartMapperG.deleteByPrimaryKey(cartId);
    }

    @Override
    public int updateByPrimaryKey(Cart record) {
        return cartMapperG.updateByPrimaryKey(record);
    }

    @Override
    public int insertIntoOrderDetail(Orderdetail orderdetailG) {
        return cartMapperG.insertIntoOrderDetail(orderdetailG);
    }
    @Override
    public int insertIntoOrder(Orders orders) {
        return cartMapperG.insertIntoOrder(orders);
    }

    @Override
    public Orders selectOrderId(Integer userId) {
        return cartMapperG.selectOrderId(userId);
    }

    @Override
    public List<Orderdetail> show() {
        return cartMapperG.show();
    }


}
