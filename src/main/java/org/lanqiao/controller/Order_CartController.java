package org.lanqiao.controller;

import org.lanqiao.entity.*;
import org.lanqiao.service.CartService_G;
import org.lanqiao.service.OrderService_W;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Order_CartController {
    @Autowired
    OrderService_W orderService;

    @RequestMapping("/getAddresses")
    public List<UserGetAddress> getAddresses(){
        return orderService.getAddresses();
    }

    @RequestMapping("/getOrderItem")
    public List<Orderdetail> getOrderItem(int id){
        return orderService.getOrderItem(id);
    }

    @RequestMapping("/getProductItem")
    public List<Orderdetail> getProductItem(){
        return orderService.getProductItem();
    }

    @RequestMapping("/insertOrder")
    public int createOrder(Orders orders){
        return orderService.insertOrders(orders);
    }

    @RequestMapping("/updateOrder")
    public int updateOrder(Orders orders){
        return orderService.updateOrderItem(orders);
    }


    @Autowired
    CartService_G cartServiceG;

    @RequestMapping("/selectcardgoods")
    List<Cart> selectAllCartGoods(){
        return cartServiceG.selectAllCartGoods();
    }
    @RequestMapping("/deleteCartGoodsById")
    int deleteByPrimaryKey(Integer cartId){return cartServiceG.deleteByPrimaryKey(cartId);};
    @RequestMapping("/updateCartById")
    int updateByPrimaryKey(Cart record){
        return cartServiceG.updateByPrimaryKey(record);
    }
    @RequestMapping(value = "/insertIntoOrderDetail")
    int insertIntoOrderDetail(Orderdetail orderdetailG){
        return cartServiceG.insertIntoOrderDetail(orderdetailG);
    }
    @RequestMapping("/insertIntoOrder")
    int insertIntoOrder(Orders orders){
        return cartServiceG.insertIntoOrder(orders);
    }
    @RequestMapping("/show")
    List<Orderdetail> show(){
        return cartServiceG.show();
    }
    @RequestMapping("/selectOrderId")
    Orders selectOrderId(Integer userId){
        return cartServiceG.selectOrderId(userId);
    }


}
