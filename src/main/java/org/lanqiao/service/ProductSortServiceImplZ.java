package org.lanqiao.service;

import org.lanqiao.entity.ProductSort;
import org.lanqiao.mapper.ProductSortMapperZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyilin on 2019/8/14.
 */
@Service
public class ProductSortServiceImplZ implements ProductSortServiceZ {

    @Autowired
    ProductSortMapperZ productSortMapperZ;

    @Override
    public int addSort(ProductSort productSort) {
//        productSortMapperZ.selectBySortName(productSort.getSortName());
        int flag = SortNameisExist(productSort.getSortName());//判断商品总类是否存在
        System.out.println(flag);
        if (flag==0){
            return 0;
        }else {
            return productSortMapperZ.insert(productSort);
        }
    }

    @Override
    public int SortNameisExist(String SortName) {
        int count = productSortMapperZ.selectBySortName(SortName);
        if (count>0){
            return 0;
        }else {
            return 1;
        }
    }

    @Override
    public List<ProductSort> showAllProSort() {
        return productSortMapperZ.showProSortList();
    }

    @Override
    public int delSort(Integer sortId) {
        return productSortMapperZ.deleteByPrimaryKey(sortId);
    }

    @Override
    public int updateSort(ProductSort productSort) {
//        判断输入的是否已存在
        int flag = SortNameisExist(productSort.getSortName());//判断商品总类是否存在
        if (flag==0){
            return 0;
        }else {
            return productSortMapperZ.updateByPrimaryKey(productSort);
        }
    }

    @Override
    public ProductSort searchSort(String sortName) {
        return productSortMapperZ.searchBySortName(sortName);
    }
}
