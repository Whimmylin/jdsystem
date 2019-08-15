package org.lanqiao.service;

import org.lanqiao.entity.ProductSort;
import org.springframework.stereotype.Service;

/**
 * Created by zhangyilin on 2019/8/14.
 */
@Service
public interface ProductSortServiceZ {
    //新增商品种类
    public int addSort(ProductSort productSort);

//    判断商品种类是否已存在
    public int  SortNameisExist(String SortName);
}
