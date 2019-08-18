package org.lanqiao.service;

import org.lanqiao.entity.Cart_G;
import org.lanqiao.entity.Orderdetail_G;
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
    public List<Cart_G> selectAllCartGoods() {
        return cartMapperG.selectAllCartGoods();
    }

    @Override
    public int deleteByPrimaryKey(Integer cartId) {
        return cartMapperG.deleteByPrimaryKey(cartId);
    }

    @Override
    public int updateByPrimaryKey(Cart_G record) {
        return cartMapperG.updateByPrimaryKey(record);
    }

    @Override
    public int insertIntoOrderDetail(Orderdetail_G orderdetailG) {
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
    public List<Orderdetail_G> show() {
        return cartMapperG.show();
    }


}
