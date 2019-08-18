package org.lanqiao.entity;

public class OrderDetail_W {
    private Integer orderItemId;

    private Integer orderId;

    private Integer proId;

    private String proName;

    private Integer proNum;
    private Orders_W orders;
    private Product_W product;
    private ProductImg_W productImg;

    public ProductImg_W getProductImg() {
        return productImg;
    }

    public void setProductImg(ProductImg_W productImg) {
        this.productImg = productImg;
    }

    public Product_W getProduct() {
        return product;
    }

    public void setProduct(Product_W product) {
        this.product = product;
    }

    public Orders_W getOrders() {
        return orders;
    }

    public void setOrders(Orders_W orders) {
        this.orders = orders;
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public Integer getProNum() {
        return proNum;
    }

    public void setProNum(Integer proNum) {
        this.proNum = proNum;
    }

}