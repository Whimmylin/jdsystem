package org.lanqiao.service;

import org.lanqiao.entity.ProductBrand;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangyilin on 2019/8/15.
 */
@Service
public interface ProBrandServiceZ {

    //新增商品品牌
    public int addBrand(ProductBrand productBrand);

    //判断商品品牌是否已存在
    public int  BrandNameisExist(String BrandName);

    //查询所有的商品品牌
    public List<ProductBrand> showAllProBrand(int pageNum,int pageSize);

    //删除商品某品牌
    public int delBrand(Integer BrandId);

    //更新商品某品牌
    public int updateBrand(ProductBrand productBrand);

    //获取品牌总数
    public int sort3PageCount();
}
