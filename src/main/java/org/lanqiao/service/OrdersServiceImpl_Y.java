package org.lanqiao.service;

import org.lanqiao.entity.Orders;
import org.lanqiao.mapper.OrdersMapper_Y;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl_Y implements OrdersService_Y{
    @Autowired
    OrdersMapper_Y ordersMapper_y;

    @Override
    public List<Orders> selectOrdersOne(int indexId) {
        return ordersMapper_y.selectOrdersOne(indexId);
    }

    @Override
    public int updateOrders(Orders orders_y) {
       return ordersMapper_y.updateByPrimaryKeySelective(orders_y);
    }

    @Override
    public int count() {
        List<Orders> list = ordersMapper_y.count();
        return list.size();
    }

    @Override
    public List<Orders> showAll(int pageNum, int pageSize) {
        return ordersMapper_y.selectByPrimaryKey((pageNum-1)*pageSize,pageSize);
    }
}
