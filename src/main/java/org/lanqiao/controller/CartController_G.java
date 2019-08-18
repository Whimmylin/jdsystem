package org.lanqiao.controller;

import org.lanqiao.entity.Cart;
import org.lanqiao.entity.Orderdetail;
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
