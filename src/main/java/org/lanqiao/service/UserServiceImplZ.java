package org.lanqiao.service;

import org.lanqiao.entity.Users;
import org.lanqiao.mapper.UsersMapperZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangyilin on 2019/8/13.
 */
@Service
public class UserServiceImplZ implements UserServiceZ {
    @Autowired
    UsersMapperZ usersMapperZ;

    @Override
    public int addUsers(Users users) {
        return usersMapperZ.insert(users);
    }

    @Override
    public boolean UserNameisExist(String UserName) {
        Users users = usersMapperZ.selectByUserName(UserName);
        if (users.getUserName()!=null){
            return true;
        }
        return false;
    }
}
