package org.lanqiao.controller;

import org.lanqiao.entity.*;
import org.lanqiao.service.OrderService_W;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController_W {
    @Autowired
    OrderService_W orderService;


    @RequestMapping("/getAddresses")
    public List<UserGetAddress_W> getAddresses(){
        return orderService.getAddresses();
    }

    @RequestMapping("/getOrderItem")
    public List<OrderDetail_W> getOrderItem(int id){
        return orderService.getOrderItem(id);
    }

    @RequestMapping("/getProductItem")
    public List<OrderDetail_W> getProductItem(){
        return orderService.getProductItem();
    }

    @RequestMapping("/insertOrder")
    public int createOrder(Orders_W orders){
        return orderService.insertOrders(orders);
    }

    @RequestMapping("/updateOrder")
    public int updateOrder(Orders_W orders){
        return orderService.updateOrderItem(orders);
    }


}
