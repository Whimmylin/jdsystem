package org.lanqiao.mapper;

import org.lanqiao.entity.UserGetAddress;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserGetAddressMapper_W {
    int insert(UserGetAddress record);

    int insertSelective(UserGetAddress record);

    public List<UserGetAddress> getAddresses();
}