package org.lanqiao.service;

import org.lanqiao.entity.ProductSort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangyilin on 2019/8/14.
 */
@Service
public interface ProductSortServiceZ {
    //新增商品种类
    public int addSort(ProductSort productSort);

    //判断商品种类是否已存在
    public int  SortNameisExist(String SortName);

    //查询所有的商品种类
    public List<ProductSort> showAllProSort();

    //删除商品某种类
    public int delSort(Integer sortId);

    //更新商品某种类
    public int updateSort(ProductSort productSort);

    //根据种类名称找记录
    public ProductSort searchSort(String sortName);
}
