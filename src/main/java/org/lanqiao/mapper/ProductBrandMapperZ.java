package org.lanqiao.mapper;

import org.lanqiao.entity.ProductBrand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductBrandMapperZ {
    int deleteByPrimaryKey(Integer brandId);

    int insert(ProductBrand record);

    int selectByBrandName(String  BrandName);

    int insertSelective(ProductBrand record);

    ProductBrand selectByPrimaryKey(Integer brandId);

    List<ProductBrand> showProBrandList(int pageNum,int pageSize);

    int updateByPrimaryKeySelective(ProductBrand record);

    int updateByPrimaryKey(ProductBrand record);

    List<ProductBrand> sort3PageCount();
}