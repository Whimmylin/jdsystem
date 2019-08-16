package org.lanqiao.mapper;

import org.lanqiao.entity.ProducTimg_H;

public interface ProducTimgMapper_H {
    int deleteByPrimaryKey(Integer imgId);

    int insert(ProducTimg_H record);

    int insertSelective(ProducTimg_H record);

    ProducTimg_H selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(ProducTimg_H record);

    int updateByPrimaryKey(ProducTimg_H record);
}