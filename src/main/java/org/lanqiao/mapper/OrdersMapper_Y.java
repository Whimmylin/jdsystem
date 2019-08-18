package org.lanqiao.mapper;

import org.lanqiao.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersMapper_Y {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByPrimaryKey(int pageNum, int pageSize);

    List<Orders> count();

    List<Orders> selectOrdersOne(int indexId);

    int updateByPrimaryKeySelective(Orders orders_y);

    int updateByPrimaryKey(Orders record);
}