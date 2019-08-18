package org.lanqiao.service;

import org.lanqiao.entity.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductServiceLL {
   public Product selectByPrimaryKey(Integer proId);
}
