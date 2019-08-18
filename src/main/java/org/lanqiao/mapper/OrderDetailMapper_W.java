package org.lanqiao.mapper;

import org.lanqiao.entity.OrderDetail_W;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderDetailMapper_W {
    int deleteByPrimaryKey(Integer orderItemId);

    int insert(OrderDetail_W record);

    int insertSelective(OrderDetail_W record);

    OrderDetail_W selectByPrimaryKey(Integer orderItemId);

    int updateByPrimaryKeySelective(OrderDetail_W record);

    int updateByPrimaryKey(OrderDetail_W record);

    public List<OrderDetail_W> getOrderItem(int id);

    public List<OrderDetail_W> getProductItem();
}