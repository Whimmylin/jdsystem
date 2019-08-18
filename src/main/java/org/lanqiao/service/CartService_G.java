package org.lanqiao.service;

import org.lanqiao.entity.Cart_G;
import org.lanqiao.entity.Orderdetail_G;
import org.lanqiao.entity.Orders;

import java.util.List;

public interface CartService_G {
    List<Cart_G> selectAllCartGoods();
    int deleteByPrimaryKey(Integer cartId);
    int updateByPrimaryKey(Cart_G record);

    int insertIntoOrderDetail(Orderdetail_G orderdetailG);
    int insertIntoOrder(Orders orders);

    Orders selectOrderId(Integer userId);

    List<Orderdetail_G> show();


}
