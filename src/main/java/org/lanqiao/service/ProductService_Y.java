package org.lanqiao.service;

import org.lanqiao.entity.Product_Y;

import java.util.List;

public interface ProductService_Y {

    public int addProduct(Product_Y productY);

    public List<Product_Y> showAll(int pageNum,int pageSize);

    public int count();

    public int deleteProduct(int indexDelete);

    public  List<Product_Y> selectProductOne(int indexId);

    public int updateProduct(Product_Y product);

}
