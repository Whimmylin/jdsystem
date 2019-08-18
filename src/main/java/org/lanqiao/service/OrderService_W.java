package org.lanqiao.service;

import org.lanqiao.entity.OrderDetail_W;
import org.lanqiao.entity.Orders_W;
import org.lanqiao.entity.UserGetAddress_W;

import java.util.List;

public interface OrderService_W {

    public List<UserGetAddress_W> getAddresses();
    public List<OrderDetail_W> getOrderItem(int id);
    public List<OrderDetail_W> getProductItem();
    public int insertOrders(Orders_W orders);
    public int updateOrderItem(Orders_W orders);

}
