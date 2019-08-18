package org.lanqiao.service;

import org.lanqiao.entity.Cart;
import org.lanqiao.entity.Orderdetail;
import org.lanqiao.entity.Orders;

import java.util.List;

public interface CartService_G {
    List<Cart> selectAllCartGoods();
    int deleteByPrimaryKey(Integer cartId);
    int updateByPrimaryKey(Cart record);

    int insertIntoOrderDetail(Orderdetail orderdetailG);
    int insertIntoOrder(Orders orders);

    Orders selectOrderId(Integer userId);

    List<Orderdetail> show();


}
