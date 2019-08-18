package org.lanqiao.entity;

public class UserGetAddress_W {
    private Integer userId;

    private String recPerson;

    private String phone;

    private String recAddress;
    private Users_W users;
    private Orders_W orders;

    public Users_W getUsers() {
        return users;
    }

    public void setUsers(Users_W users) {
        this.users = users;
    }

    public Orders_W getOrders() {
        return orders;
    }

    public void setOrders(Orders_W orders) {
        this.orders = orders;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRecPerson() {
        return recPerson;
    }

    public void setRecPerson(String recPerson) {
        this.recPerson = recPerson == null ? null : recPerson.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRecAddress() {
        return recAddress;
    }

    public void setRecAddress(String recAddress) {
        this.recAddress = recAddress == null ? null : recAddress.trim();
    }
}