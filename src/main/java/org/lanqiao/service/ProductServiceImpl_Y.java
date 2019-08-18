package org.lanqiao.service;

import org.lanqiao.entity.ProductImg_Y;
import org.lanqiao.entity.Product_Y;
import org.lanqiao.mapper.ProductImg_YMapper;
import org.lanqiao.mapper.ProductMapper_Y;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl_Y implements ProductService_Y {
    @Autowired
    ProductMapper_Y productMapper_y;
    @Autowired
    ProductImg_YMapper productImg_yMapper;

    @Override
    public int deleteProduct(int indexDelete) {
        return productMapper_y.deleteByPrimaryKey(indexDelete);
    }

    @Override
    public int count() {
        List<Product_Y> product_yList = productMapper_y.count();
        return product_yList.size();
    }

    @Override
    public int updateProduct(Product_Y product) {
        return productMapper_y.updateByPrimaryKeySelective(product);
    }

    @Override
    public int addProductImg(ProductImg_Y productImg_y) {
        return productImg_yMapper.insert(productImg_y);
    }

    @Override
    public  List<Product_Y> selectProductOne(int indexId) {
        return productMapper_y.selectProductOne(indexId);
    }

    @Override
    public List<Product_Y> showAll(int pageNum,int pageSize){
        return productMapper_y.selectByPrimaryKey((pageNum-1)*pageSize,pageSize);
    }

    @Override
    public int addProduct(Product_Y productY) {
        return productMapper_y.insert(productY);
    }
}
