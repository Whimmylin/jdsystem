package org.lanqiao.mapper;

import org.lanqiao.entity.Productimg;

public interface ProductimgMapper {
    int deleteByPrimaryKey(Integer imgId);

    int insert(Productimg record);

    int insertSelective(Productimg record);

    Productimg selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(Productimg record);

    int updateByPrimaryKey(Productimg record);
}