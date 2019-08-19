package org.lanqiao.mapper;

import org.lanqiao.entity.Orderdetail;

public interface OrderdetailMapper {
    int deleteByPrimaryKey(Integer orderItemId);

    int insert(Orderdetail record);

    int insertSelective(Orderdetail record);

    Orderdetail selectByPrimaryKey(Integer orderItemId);

    int updateByPrimaryKeySelective(Orderdetail record);

    int updateByPrimaryKey(Orderdetail record);
}