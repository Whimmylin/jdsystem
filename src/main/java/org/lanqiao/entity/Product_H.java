package org.lanqiao.entity;

import java.util.Date;
import java.util.Set;

public class Product_H {
    private Integer proId;

    private Set<ProductBrand_H> productbrand;

    private Set<ProductSort_H> productsort;

    private ProducTimg_H productimg;

    private String proName;

    private Integer proPrice;

    private Integer proStock;

    private Date proOut;

    private String proState;

    private String proDetail;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Set<ProductBrand_H> getProductbrand() {
        return productbrand;
    }

    public void setProductbrand(Set<ProductBrand_H> productbrand) {
        this.productbrand = productbrand;
    }

    public Set<ProductSort_H> getProductsort() {
        return productsort;
    }

    public void setProductsort(Set<ProductSort_H> productsort) {
        this.productsort = productsort;
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

    public ProducTimg_H getProductimg() {
        return productimg;
    }

    public void setProductimg(ProducTimg_H productimg) {
        this.productimg = productimg;
    }
}