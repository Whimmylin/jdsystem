package org.lanqiao.controller;

import org.lanqiao.entity.ProductSort;
import org.lanqiao.service.ProductSortServiceZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangyilin on 2019/8/14.
 */
@RestController
public class ManaController {
    @Autowired
    ProductSortServiceZ productSortServiceZ;

    @RequestMapping("/addSort")
    public int addSort(ProductSort record){
        return productSortServiceZ.addSort(record);
    }
}
