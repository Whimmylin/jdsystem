package org.lanqiao.service;

import org.lanqiao.entity.ProductLL;
import org.springframework.stereotype.Service;

@Service
public interface ProductServiceLL {
   public ProductLL selectByPrimaryKey(Integer proId);
}
