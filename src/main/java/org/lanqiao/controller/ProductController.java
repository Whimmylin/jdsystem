package org.lanqiao.controller;

import org.lanqiao.entity.Cart;
import org.lanqiao.entity.Key;
import org.lanqiao.entity.Product;
import org.lanqiao.service.CartServiceLL;
import org.lanqiao.service.ProductServiceLL;
import org.lanqiao.service.ProductService_H;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

@Autowired
ProductService_H productservice;

@RequestMapping("/get")
public List getAll(Key key){

    return  productservice.getAllProduct(key);
}
    @RequestMapping("/fy")
    public List FY(Key key){
        return  productservice.FY(key);
    }

    @RequestMapping("/count")
    public int count(Key key){
        return  productservice.Count(key);
    }

    @Autowired
    ProductServiceLL productServiceLL;
    @Autowired
    CartServiceLL cartServiceLL;

    @RequestMapping("/getproduct")
    public Product GetProduct(Integer proId){
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
