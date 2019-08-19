package org.lanqiao.service;

import org.lanqiao.entity.Key;
import org.lanqiao.mapper.ProductMapper_H;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductserviceImpl_H implements ProductService_H {
  @Autowired
  ProductMapper_H product;


    @Override
    public List getAllProduct(Key key) {
//     Key ke=new Key();
//     ke.setInput("A");
////     ke.setTprice(9000);
    return  product.selectByPrimaryKey(key);
    }

    @Override
    public List FY(Key key) {
//     Key ke=new Key();
//    ke.setPageNum(0);
//    ke.setPageSize(3);
//    ke.setInput("手机");
        int q=0;
        q=key.getPageNum()*key.getPageSize();
       key.setPageNum( q );
        return product.FY(key);
    }

    @Override
    public int Count(Key key) {
//       Key ke=new Key();
//        ke.setInput("A");
        return product.Count(key);

    }
}
