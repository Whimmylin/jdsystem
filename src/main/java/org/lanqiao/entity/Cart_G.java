package org.lanqiao.entity;

public class Cart_G {
    private Integer cartId;

    private Users users;

    private  Integer proNum;

    private Product_G productG;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Product_G getProductG() {
        return productG;
    }

    public void setProductG(Product_G productG) {
        this.productG = productG;
    }

    public Integer getProNum() {
        return proNum;
    }

    public void setProNum(Integer proNum) {
        this.proNum = proNum;
    }
}