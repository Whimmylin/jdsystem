package org.lanqiao.entity;

public class Key {
    private String Input;
    private String BrandName;
    private String SortName;
    private String PX;
    private  int dprice;
    private  int tprice;
    private  String dtprice;
    private  int  PageNum;
    private  int  PageSize;


    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getSortName() {
        return SortName;
    }

    public void setSortName(String sortName) {
        SortName = sortName;
    }

    public String getInput() {
        return Input;
    }

    public void setInput(String input) {
        Input = input;
    }

    public String getPX() {
        return PX;
    }

    public void setPX(String PX) {
        this.PX = PX;
    }

    public int getDprice() {
        return dprice;
    }

    public void setDprice(int dprice) {
        this.dprice = dprice;
    }

    public int getTprice() {
        return tprice;
    }

    public void setTprice(int tprice) {
        this.tprice = tprice;
    }

    public String getDtprice() {
        return dtprice;
    }

    public void setDtprice(String dtprice) {
        this.dtprice = dtprice;
    }

    public int getPageNum() {
        return PageNum;
    }

    public void setPageNum(int pageNum) {
        PageNum = pageNum;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int pageSize) {
        PageSize = pageSize;
    }
}
