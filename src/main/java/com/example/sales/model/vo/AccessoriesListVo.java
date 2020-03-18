package com.example.sales.model.vo;

/**
 * @author 马泽朋
 * @version 1.0
 * @date 2020/3/7 下午 5:15
 */
public class AccessoriesListVo {
    /**
     * 产品配置id
     */
    private String clid;
    private Integer pnid;
    private Integer aid;
    private Integer num;
    private Integer packageNum;
    private double totalPrice;
    private String aname;
    private String pnname;

    @Override
    public String toString() {
        return "AccessoriesListVo{" +
                "pnid=" + pnid +
                ", aid=" + aid +
                ", num=" + num +
                ", packageNum=" + packageNum +
                ", totalPrice=" + totalPrice +
                ", aname='" + aname + '\'' +
                ", pnname='" + pnname + '\'' +
                '}';
    }

    public String getClid() {
        return clid;
    }

    public void setClid(String clid) {
        this.clid = clid;
    }

    public Integer getPnid() {
        return pnid;
    }

    public void setPnid(Integer pnid) {
        this.pnid = pnid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getPackageNum() {
        return packageNum;
    }

    public void setPackageNum(Integer packageNum) {
        this.packageNum = packageNum;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getPnname() {
        return pnname;
    }

    public void setPnname(String pnname) {
        this.pnname = pnname;
    }
}
