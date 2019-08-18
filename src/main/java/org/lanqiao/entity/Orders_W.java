package org.lanqiao.entity;

import java.util.Date;
import java.util.Set;

public class Orders_W {
    private Integer orderId;

//    private Integer orderItemId;

    private Integer userId;

    private Integer orderMoney;

    private String payWay;

    private Date orderTime;

    private Integer orderSum;

    private String recName;

    private String recPhone;

    private String recAddress;

    private Set<OrderDetail_W> orderDetails;

    private Users_W users;

    public Set<OrderDetail_W> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Set<OrderDetail_W> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Users_W getUsers() {
        return users;
    }

    public void setUsers(Users_W users) {
        this.users = users;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Integer orderMoney) {
        this.orderMoney = orderMoney;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getOrderSum() {
        return orderSum;
    }

    public void setOrderSum(Integer orderSum) {
        this.orderSum = orderSum;
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName == null ? null : recName.trim();
    }

    public String getRecPhone() {
        return recPhone;
    }

    public void setRecPhone(String recPhone) {
        this.recPhone = recPhone == null ? null : recPhone.trim();
    }

    public String getRecAddress() {
        return recAddress;
    }

    public void setRecAddress(String recAddress) {
        this.recAddress = recAddress == null ? null : recAddress.trim();
    }
}