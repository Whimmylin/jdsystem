package org.lanqiao.controller;

import org.lanqiao.entity.Key;
import org.lanqiao.service.ProductService_H;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController_H {

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
}
