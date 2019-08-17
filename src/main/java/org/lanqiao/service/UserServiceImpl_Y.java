package org.lanqiao.service;

import org.lanqiao.entity.Users;
import org.lanqiao.mapper.UsersMapper_Y;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl_Y implements UserService_Y {
    @Autowired
    UsersMapper_Y usersMapper_y;

    @Override
    public boolean selectByPrimaryKey(String userName, String password){
       Set<Users> usersList = usersMapper_y.selectByPrimaryKey(userName,password);
       System.out.println(usersList);
        if (usersList.size() < 1)
            return false;
        else{
            return true;
        }
    }
}
