package org.lanqiao.controller;
import org.lanqiao.entity.ProductBrand;
import org.lanqiao.entity.ProductSort;
import org.lanqiao.service.ProBrandServiceZ;
import org.lanqiao.service.ProductSortServiceZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhangyilin on 2019/8/14.
 */
@RestController
public class ManaController {
    @Autowired
    ProductSortServiceZ productSortServiceZ;

    @Autowired
    ProBrandServiceZ proBrandServiceZ;

    @RequestMapping("/addSort")
    public int addSort(ProductSort record){
        return productSortServiceZ.addSort(record);
    }

    @RequestMapping("/getAllSort")
    public List<ProductSort> getAllSort(int pageNum,int pageSize){
        return productSortServiceZ.showAllProSort(pageNum,pageSize);
    }

    @RequestMapping("/delSort")
    public int delSort(Integer sortId){
        return productSortServiceZ.delSort(sortId);
    }

    @RequestMapping("/updateSort")
    public int updateSort(ProductSort record){
        return productSortServiceZ.updateSort(record);
    }

    @RequestMapping("/addBrand")
    public int addBrand(ProductBrand record){
        return proBrandServiceZ.addBrand(record);
    }

    @RequestMapping("/getAllBrand")
    public List<ProductBrand> getAllBrand(int pageNum,int pageSize){
        return proBrandServiceZ.showAllProBrand(pageNum,pageSize);
    }

    @RequestMapping("/delBrand")
    public int delBrand(Integer brandId){
        return proBrandServiceZ.delBrand(brandId);
    }

    @RequestMapping("/updateBrand")
    public int updateBrand(ProductBrand record){
        return proBrandServiceZ.updateBrand(record);
    }

    @RequestMapping("/sort2PageCount")
    public int sort2PageCount(){
        return productSortServiceZ.sort2PageCount();
    }

    @RequestMapping("sort3PageCount")
    public int sort3PageCount(){
        return proBrandServiceZ.sort3PageCount();
    }
}
