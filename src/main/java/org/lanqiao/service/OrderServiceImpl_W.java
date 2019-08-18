package org.lanqiao.service;

import org.lanqiao.entity.OrderDetail_W;
import org.lanqiao.entity.Orders_W;
import org.lanqiao.entity.UserGetAddress_W;
import org.lanqiao.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl_W implements OrderService_W {
    @Autowired
    OrdersMapper_W ordersMapper;
    @Autowired
    OrderDetailMapper_W orderDetailMapper;
    @Autowired
    UserGetAddressMapper_W userGetAddressMapper;
    @Autowired
    UsersMapper_W usersMapper;
    @Autowired
    ProductImgMapper_W productImgMapper;

    @Override
    public List<UserGetAddress_W> getAddresses(){
//        return usersMapper.selectByPrimaryKey(1);
        return userGetAddressMapper.getAddresses();
    }

    @Override
    public int insertOrders(Orders_W orders){
        orders.setOrderTime(new Date());
        return ordersMapper.insert(orders);
    }
    @Override
    public int updateOrderItem(Orders_W orders){
        orders.setOrderTime(new Date());
        return ordersMapper.updateOrderItem(orders);
    }

    @Override
    public List<OrderDetail_W> getOrderItem(int id){
        return orderDetailMapper.getOrderItem(id);
    }
    @Override
    public List<OrderDetail_W> getProductItem(){
        return orderDetailMapper.getProductItem();
    }


}
