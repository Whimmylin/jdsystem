package org.lanqiao.service;

import org.lanqiao.entity.ProductImg;
import org.lanqiao.entity.Product;

import java.util.List;

public interface ProductService_Y {

    public int addProduct(Product productY);

    public List<Product> showAll(int pageNum, int pageSize);

    public int count();

    public int deleteProduct(int indexDelete);

    public  List<Product> selectProductOne(int indexId);

    public int updateProduct(Product product);

    public int addProductImg(ProductImg productImg_y);

}
