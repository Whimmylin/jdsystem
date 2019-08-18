package org.lanqiao.mapper;

import org.lanqiao.entity.Users_W;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapper_W {
    int deleteByPrimaryKey(Integer userId);

    int insert(Users_W record);

    int insertSelective(Users_W record);

    Users_W selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Users_W record);

    int updateByPrimaryKey(Users_W record);
}