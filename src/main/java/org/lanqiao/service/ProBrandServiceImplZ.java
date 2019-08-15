package org.lanqiao.service;

import org.lanqiao.entity.ProductBrand;
import org.lanqiao.mapper.ProductBrandMapperZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangyilin on 2019/8/15.
 */
@Service
public class ProBrandServiceImplZ implements ProBrandServiceZ {
    @Autowired
    ProductBrandMapperZ productBrandMapperZ;

    @Override
    public int addBrand(ProductBrand productBrand) {
        int flag = BrandNameisExist(productBrand.getBrandName());//判断商品总类是否存在
        System.out.println(flag);
        if (flag==0){
            return 0;
        }else {
            return productBrandMapperZ.insert(productBrand);
        }
    }

    @Override
    public int BrandNameisExist(String BrandName) {
        int count = productBrandMapperZ.selectByBrandName(BrandName);
        if (count>0){
            return 0;
        }else {
            return 1;
        }
    }

    @Override
    public List<ProductBrand> showAllProBrand() {
        return productBrandMapperZ.showProBrandList();
    }

    @Override
    public int delBrand(Integer BrandId) {
        return productBrandMapperZ.deleteByPrimaryKey(BrandId);
    }

    @Override
    public int updateBrand(ProductBrand productBrand) {
        //        判断输入的是否已存在
        int flag = BrandNameisExist(productBrand.getBrandName());//判断商品总类是否存在
        if (flag==0){
            return 0;
        }else {
            return productBrandMapperZ.updateByPrimaryKey(productBrand);
        }
    }
}
