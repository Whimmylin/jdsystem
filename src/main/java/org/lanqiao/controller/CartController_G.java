package org.lanqiao.controller;

import org.lanqiao.entity.Cart_G;
import org.lanqiao.entity.Orderdetail_G;
import org.lanqiao.entity.Orders;
import org.lanqiao.service.CartService_G;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController_G {
    @Autowired
    CartService_G cartServiceG;
    @RequestMapping("/selectcardgoods")
    List<Cart_G> selectAllCartGoods(){
        return cartServiceG.selectAllCartGoods();
    }
    @RequestMapping("/deleteCartGoodsById")
    int deleteByPrimaryKey(Integer cartId){return cartServiceG.deleteByPrimaryKey(cartId);};
    @RequestMapping("/updateCartById")
    int updateByPrimaryKey(Cart_G record){
        return cartServiceG.updateByPrimaryKey(record);
    }
    @RequestMapping(value = "/insertIntoOrderDetail")
    int insertIntoOrderDetail(Orderdetail_G orderdetailG){
         return cartServiceG.insertIntoOrderDetail(orderdetailG);
    }
    @RequestMapping("/insertIntoOrder")
    int insertIntoOrder(Orders orders){
        return cartServiceG.insertIntoOrder(orders);
    }
    @RequestMapping("/show")
    List<Orderdetail_G> show(){
        return cartServiceG.show();
    }
    @RequestMapping("/selectOrderId")
    Orders selectOrderId(Integer userId){
        return cartServiceG.selectOrderId(userId);
    }

}
