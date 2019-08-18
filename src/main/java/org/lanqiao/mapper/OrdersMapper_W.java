package org.lanqiao.mapper;

import org.lanqiao.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrdersMapper_W {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Orders orders);

    int updateOrderItem(Orders orders);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    List<Orders> getOrderId();
}