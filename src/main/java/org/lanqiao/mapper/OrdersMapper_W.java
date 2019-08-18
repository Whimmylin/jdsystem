package org.lanqiao.mapper;

import org.lanqiao.entity.Orders_W;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrdersMapper_W {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Orders_W orders);

    int updateOrderItem(Orders_W orders);

    int insertSelective(Orders_W record);

    Orders_W selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Orders_W record);

    int updateByPrimaryKey(Orders_W record);

    List<Orders_W> getOrderId();
}