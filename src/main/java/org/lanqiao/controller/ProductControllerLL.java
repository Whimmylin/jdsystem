package org.lanqiao.controller;

import org.lanqiao.entity.Cart;
import org.lanqiao.entity.ProductLL;
import org.lanqiao.service.CartServiceLL;
import org.lanqiao.service.ProductServiceLL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllerLL {
    @Autowired
    ProductServiceLL productServiceLL;
    @Autowired
    CartServiceLL cartServiceLL;

    @RequestMapping("/getproduct")
    public ProductLL GetProduct(Integer proId){
        return  productServiceLL.selectByPrimaryKey(proId);
    }

    @RequestMapping("/sendToCart")
    public  int insertToCart(Cart record){
        return cartServiceLL.insert(record);
    }

    @RequestMapping("/getCartCount")
    public int GetCartCount(Integer userId){
        return cartServiceLL.selectByUserId(userId);
    }
}
