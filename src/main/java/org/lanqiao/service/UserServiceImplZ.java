package org.lanqiao.service;

import org.lanqiao.entity.Users;
import org.lanqiao.mapper.UsersMapperZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public int UserNameisExist(String UserName) {
        int count = usersMapperZ.selectByUserName(UserName);
        if (count>0){
            return 0;
        }else {
            return 1;
        }
    }
}
