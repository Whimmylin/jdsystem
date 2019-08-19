package org.lanqiao.service;

import org.lanqiao.entity.Orders;

import java.util.List;

public interface OrdersService_Y {

    public int count();

    public List<Orders> showAll(int pageNum, int pageSize);

    public List<Orders> selectOrdersOne(int indexId);

    public int updateOrders(Orders orders_y);
}
