package org.lanqiao.mapper;

import org.lanqiao.entity.Cart_G;
import org.lanqiao.entity.Orderdetail_G;
import org.lanqiao.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartMapper_G {

    int deleteByPrimaryKey(Integer cartId);

    int insert(Cart_G record);

    int insertSelective(Cart_G record);

    Cart_G selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(Cart_G record);

    int updateByPrimaryKey(Cart_G record);

    List<Cart_G> selectAllCartGoods();

    int insertIntoOrderDetail(Orderdetail_G orderdetailG);

    int insertIntoOrder(Orders orders);

    Orders selectOrderId(Integer userId);

    List<Orderdetail_G> show();

}