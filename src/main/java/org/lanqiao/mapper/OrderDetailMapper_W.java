package org.lanqiao.mapper;

import org.lanqiao.entity.Orderdetail;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderDetailMapper_W {
    int deleteByPrimaryKey(Integer orderItemId);

    int insert(Orderdetail record);

    int insertSelective(Orderdetail record);

    Orderdetail selectByPrimaryKey(Integer orderItemId);

    int updateByPrimaryKeySelective(Orderdetail record);

    int updateByPrimaryKey(Orderdetail record);

    public List<Orderdetail> getOrderItem(int id);

    public List<Orderdetail> getProductItem();
}