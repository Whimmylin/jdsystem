package org.lanqiao.service;

import org.lanqiao.entity.Users;
import org.springframework.stereotype.Service;

/**
 * Created by zhangyilin on 2019/8/13.
 */
@Service
public interface UserServiceZ {
    //注册
    public int addUsers(Users users);

    //验证名字
    public boolean UserNameisExist(String UserName);
}
