package org.lanqiao.mapper;

import org.lanqiao.entity.Orderdetail_G;

public interface OrderdetailMapper {
    int deleteByPrimaryKey(Integer orderItemId);

    int insert(Orderdetail_G record);

    int insertSelective(Orderdetail_G record);

    Orderdetail_G selectByPrimaryKey(Integer orderItemId);

    int updateByPrimaryKeySelective(Orderdetail_G record);

    int updateByPrimaryKey(Orderdetail_G record);
}