package org.lanqiao.service;


import org.lanqiao.entity.Users;

import java.util.List;

public interface UserService_Y {
    public List<Users> selectByPrimaryKey(String userName, String password);
}
