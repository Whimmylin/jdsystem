package org.lanqiao.controller;

import org.lanqiao.entity.ProductImg;
import org.lanqiao.entity.Product;
import org.lanqiao.service.ProductService_Y;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Product_ManaController {
    @Autowired
    ProductService_Y productService_y;

    @RequestMapping("/addProduct")
    public int addProduct(Product productY){
        return  productService_y.addProduct(productY);
    }

    @RequestMapping("/selectProduct")
    public List<Product> showAll(int pageNum, int pageSize){
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
    public  List<Product> selectProductOne(int indexId){
        return productService_y.selectProductOne(indexId);
    }

    @RequestMapping("/updateProduct")
    public int updateProduct(Product product){
        return productService_y.updateProduct(product);
    }

    @RequestMapping("/addProductImg")
    public  int addProductImg(ProductImg productImg_y){
        return productService_y.addProductImg(productImg_y);
    }
}
