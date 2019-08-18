package org.lanqiao.mapper;

import org.lanqiao.entity.Cart;
import org.lanqiao.entity.Orderdetail;
import org.lanqiao.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartMapper_G {

    int deleteByPrimaryKey(Integer cartId);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    List<Cart> selectAllCartGoods();

    int insertIntoOrderDetail(Orderdetail orderdetailG);

    int insertIntoOrder(Orders orders);

    Orders selectOrderId(Integer userId);

    List<Orderdetail> show();

}