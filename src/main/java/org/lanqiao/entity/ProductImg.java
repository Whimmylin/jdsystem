package org.lanqiao.entity;

public class ProductImg {
    private Integer imgId;

    private Integer proId;

    private String imgDetail;

    private String imgUrl;

    private String isImgMain;

    private Orderdetail orderDetail;

    public Orderdetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(Orderdetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getImgDetail() {
        return imgDetail;
    }

    public void setImgDetail(String imgDetail) {
        this.imgDetail = imgDetail == null ? null : imgDetail.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getIsImgMain() {
        return isImgMain;
    }

    public void setIsImgMain(String isImgMain) {
        this.isImgMain = isImgMain == null ? null : isImgMain.trim();
    }
}