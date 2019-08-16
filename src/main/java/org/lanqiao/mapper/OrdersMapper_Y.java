package org.lanqiao.mapper;

import org.lanqiao.entity.Orders_Y;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersMapper_Y {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Orders_Y record);

    int insertSelective(Orders_Y record);

    List<Orders_Y> selectByPrimaryKey(int pageNum,int pageSize);

    List<Orders_Y> count();

    List<Orders_Y> selectOrdersOne(int indexId);

    int updateByPrimaryKeySelective(Orders_Y orders_y);

    int updateByPrimaryKey(Orders_Y record);
}