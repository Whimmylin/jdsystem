package org.lanqiao.entity;

public class Cart {
    private Integer cartId;

    private Integer userId;

    private Integer proId;

    private Integer proNum;

    private Users users;

    private Product productG;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getProNum() {
        return proNum;
    }

    public void setProNum(Integer proNum) {
        this.proNum = proNum;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Product getProductG() {
        return productG;
    }

    public void setProductG(Product productG) {
        this.productG = productG;
    }
}