package org.lanqiao.service;

import org.lanqiao.entity.ProductImg;
import org.lanqiao.entity.Product;
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
        List<Product> product_yList = productMapper_y.count();
        return product_yList.size();
    }

    @Override
    public int updateProduct(Product product) {
        return productMapper_y.updateByPrimaryKeySelective(product);
    }

    @Override
    public int addProductImg(ProductImg productImg_y) {
        return productImg_yMapper.insert(productImg_y);
    }

    @Override
    public  List<Product> selectProductOne(int indexId) {
        return productMapper_y.selectProductOne(indexId);
    }

    @Override
    public List<Product> showAll(int pageNum, int pageSize){
        return productMapper_y.selectByPrimaryKey((pageNum-1)*pageSize,pageSize);
    }

    @Override
    public int addProduct(Product productY) {
        return productMapper_y.insert(productY);
    }
}
