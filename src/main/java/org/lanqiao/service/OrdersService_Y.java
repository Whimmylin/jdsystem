package org.lanqiao.service;

import org.lanqiao.entity.Orders_Y;

import java.util.List;

public interface OrdersService_Y {

    public int count();

    public List<Orders_Y> showAll(int pageNum, int pageSize);

    public List<Orders_Y> selectOrdersOne(int indexId);

    public int updateOrders(Orders_Y orders_y);
}
