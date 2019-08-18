package org.lanqiao.service;

import org.lanqiao.entity.Orderdetail;
import org.lanqiao.entity.Orders;
import org.lanqiao.entity.UserGetAddress;

import java.util.List;

public interface OrderService_W {

    public List<UserGetAddress> getAddresses();
    public List<Orderdetail> getOrderItem(int id);
    public List<Orderdetail> getProductItem();
    public int insertOrders(Orders orders);
    public int updateOrderItem(Orders orders);

}
