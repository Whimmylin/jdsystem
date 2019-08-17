package org.lanqiao.entity;

import java.util.Date;
import java.util.Set;

public class ProductLL {
    private Integer proId;

    private Integer brandId;

    private Integer sortId;

    private String proName;

    private Integer proPrice;

    private Integer proStock;

    private Date proOut;

    private String proState;

    private String proDetail;

    private ProductSort productSort;

    private  ProductBrand productBrand;

    private Set<ProductImg> productImgs;

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

    public ProductSort getProductSort() {
        return productSort;
    }

    public void setProductSort(ProductSort productSort) {
        this.productSort = productSort;
    }

    public ProductBrand getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(ProductBrand productBrand) {
        this.productBrand = productBrand;
    }

    public Set<ProductImg> getProductImgs() {
        return productImgs;
    }

    public void setProductImgs(Set<ProductImg> productImgs) {
        this.productImgs = productImgs;
    }

    @Override
    public String toString() {
        return "ProductLL{" +
                "proId=" + proId +
                ", brandId=" + brandId +
                ", sortId=" + sortId +
                ", proName='" + proName + '\'' +
                ", proPrice=" + proPrice +
                ", proStock=" + proStock +
                ", proOut=" + proOut +
                ", proState='" + proState + '\'' +
                ", proDetail='" + proDetail + '\'' +
                '}';
    }
}