package org.lanqiao.mapper;

import org.lanqiao.entity.Users;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface UsersMapper_Y {
//    int deleteByPrimaryKey(Integer userId);
//
//    int insert(Users record);
//
//    int insertSelective(Users record);
//
      Set<Users> selectByPrimaryKey(String userName, String password);
//
//    int updateByPrimaryKeySelective(Users record);
//
//    int updateByPrimaryKey(Users record);

//    boolean checkUsers(String usersName,String password);

}