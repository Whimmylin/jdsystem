package org.lanqiao.controller;

import org.lanqiao.entity.Product_Y;
import org.lanqiao.service.ProductService_Y;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController_Y {
    @Autowired
    ProductService_Y productService_y;

    @RequestMapping("/addProduct")
    public int addProduct(Product_Y productY){
        return  productService_y.addProduct(productY);
    }

    @RequestMapping("/selectProduct")
    public List<Product_Y> showAll(int pageNum,int pageSize){
        return productService_y.showAll(pageNum,pageSize);
    }
    @RequestMapping("/productPageCount")
    public int count(){
        return productService_y.count();
    }

    @RequestMapping("/deleteProduct")
    public int deleteProduct(int indexDelete){
        return productService_y.deleteProduct(indexDelete);
    }

    @RequestMapping("/selectProductOne")
    public  List<Product_Y> selectProductOne(int indexId){
        return productService_y.selectProductOne(indexId);
    }

    @RequestMapping("/updateProduct")
    public int updateProduct(Product_Y product){
        return productService_y.updateProduct(product);
    }
}
