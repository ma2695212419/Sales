package com.example.sales.model.entity;

import java.io.Serializable;

/**
 * configuration_list
 * @author 
 */
public class ConfigurationList implements Serializable {
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
     * 产品配件id
     */
    private Integer aid;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 套数
     */
    private Integer packageNum;

    /**
     * 总计价格
     */
    private Double totalPrice;

    private static final long serialVersionUID = 1L;

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

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}