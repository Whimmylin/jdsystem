package org.lanqiao.controller;

import org.lanqiao.entity.Users;
import org.lanqiao.service.UserService_Y;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
public class UsersController_Y {
@Autowired
    UserService_Y userService_y;
@RequestMapping("/checked")
public boolean selectByPrimaryKey(HttpServletResponse response, String userName , String password){
    List<Users> list = userService_y.selectByPrimaryKey(userName,password);
   if(list.size()>0)
   {
       String id = list.get(0).getUserId().toString();
       Cookie cookie = new Cookie("userId",id );
       cookie.setPath("/");
       response.addCookie(cookie);
       return true;
   }
       return false;
   }
}
