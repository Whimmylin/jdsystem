package org.lanqiao.service;

import org.lanqiao.entity.ProductLL;
import org.lanqiao.mapper.ProductMapperLL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImplLL implements ProductServiceLL {
   @Autowired
   ProductMapperLL productMapper;
    @Override
    public ProductLL selectByPrimaryKey(Integer proId) {
        return productMapper.selectByPrimaryKey(proId);
    }
}
