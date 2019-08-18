package org.lanqiao.entity;

import java.util.Date;

public class Product_W {
    private Integer proId;

    private Integer brandId;

    private Integer sortId;

    private String proName;

    private Integer proPrice;

    private Integer proStock;

    private Date proOut;

    private String proState;

    private String proDetail;
    private OrderDetail_W orderDetail;

    public OrderDetail_W getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail_W orderDetail) {
        this.orderDetail = orderDetail;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public Integer getProPrice() {
        return proPrice;
    }

    public void setProPrice(Integer proPrice) {
        this.proPrice = proPrice;
    }

    public Integer getProStock() {
        return proStock;
    }

    public void setProStock(Integer proStock) {
        this.proStock = proStock;
    }

    public Date getProOut() {
        return proOut;
    }

    public void setProOut(Date proOut) {
        this.proOut = proOut;
    }

    public String getProState() {
        return proState;
    }

    public void setProState(String proState) {
        this.proState = proState == null ? null : proState.trim();
    }

    public String getProDetail() {
        return proDetail;
    }

    public void setProDetail(String proDetail) {
        this.proDetail = proDetail == null ? null : proDetail.trim();
    }
}