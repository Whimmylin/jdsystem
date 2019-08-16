package org.lanqiao.controller;

import org.lanqiao.entity.Orders_Y;
import org.lanqiao.service.OrdersService_Y;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersController_Y {
    @Autowired
    OrdersService_Y ordersService_y;

    @RequestMapping("/selectOrders")

    public List<Orders_Y> selectOrders(int pageNum,int pageSize){
        return ordersService_y.showAll(pageNum,pageSize);
    }

    @RequestMapping("/ordersPageCount")
    public int count(){
        return ordersService_y.count();
    }

    @RequestMapping("/selectOrdersOne")
    public  List<Orders_Y> selectOrdersOne(int indexId){
        return ordersService_y.selectOrdersOne(indexId);
    }

    @RequestMapping("/updateOrders")
    public  int updateOrders(Orders_Y orders_y){
        return ordersService_y.updateOrders(orders_y);
    }
}
