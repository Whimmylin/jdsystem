package org.lanqiao.mapper;

import org.lanqiao.entity.UserGetAddress_W;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserGetAddressMapper_W {
    int insert(UserGetAddress_W record);

    int insertSelective(UserGetAddress_W record);

    public List<UserGetAddress_W> getAddresses();
}