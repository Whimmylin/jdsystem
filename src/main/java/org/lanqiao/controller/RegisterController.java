package org.lanqiao.controller;

import org.lanqiao.service.UserServiceZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.lanqiao.entity.Users;

/**
 * Created by zhangyilin on 2019/8/13.
 */
@RestController
public class RegisterController {

    @Autowired
    UserServiceZ userServiceZ;

    @RequestMapping("/insert")
    public int insert(Users users){
        return userServiceZ.addUsers(users);
    }

    @RequestMapping("/check")
    public int checkUser(String userName){
        return userServiceZ.UserNameisExist(userName);
    }
}
