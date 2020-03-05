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
    private Integer clid;

    /**
     * 产品单号id
     */
    private Integer cid;

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
    private Integer totalPrice;

    private static final long serialVersionUID = 1L;

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
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

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}