package org.lanqiao.mapper;

import org.lanqiao.entity.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapperZ {
//    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);
    Users selectByUserName(String  UserName);

//    int insertSelective(Users record);

//    Users selectByPrimaryKey(Integer userId);



//    int updateByPrimaryKeySelective(Users record);

//    int updateByPrimaryKey(Users record);
}