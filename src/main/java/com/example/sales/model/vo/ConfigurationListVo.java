package com.example.sales.model.vo;

import java.io.Serializable;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/3/14 14:31
 * @package com.example.sales.model.vo
 */
public class ConfigurationListVo implements Serializable {
    /**
     * 产品配置id
     */
    private String clid;

    /**
     * 产品单号id
     */
    private String cid;

    /**
     * 产品型号id
     */
    private Integer pnid;

    /**
     * 产品型号名称
     */
    private String pnname;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 产品配件id
     */
    private Integer aid;

    /**
     * 产品配件名称
     */
    private String aname;

    /**
     * 套数
     */
    private Integer packageNum;

    /**
     * 总计价格
     */
    private Integer totalPrice;

    public String getClid() {
        return clid;
    }

    public void setClid(String clid) {
        this.clid = clid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Integer getPnid() {
        return pnid;
    }

    public void setPnid(Integer pnid) {
        this.pnid = pnid;
    }

    public String getPnname() {
        return pnname;
    }

    public void setPnname(String pnname) {
        this.pnname = pnname;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Integer getPackageNum() {
        return packageNum;
    }

    public void setPackageNum(Integer packageNum) {
        this.packageNum = packageNum;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "ConfigurationListVo{" +
                "clid='" + clid + '\'' +
                ", cid='" + cid + '\'' +
                ", pnid=" + pnid +
                ", pnname='" + pnname + '\'' +
                ", num=" + num +
                ", aid=" + aid +
                ", aname='" + aname + '\'' +
                ", packageNum=" + packageNum +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
