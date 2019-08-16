package org.lanqiao.controller;

import org.lanqiao.service.UserService_Y;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsersController_Y {
@Autowired
    UserService_Y userService_y;
@RequestMapping("/checked")
public boolean selectByPrimaryKey(String userName , String password){

    return userService_y.selectByPrimaryKey(userName,password);
}


}
