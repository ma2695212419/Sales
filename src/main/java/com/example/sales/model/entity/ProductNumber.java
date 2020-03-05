package com.example.sales.model.entity;

import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

/**
 * product_number
 * @author 
 */
@Mapper
public class ProductNumber implements Serializable {
    /**
     * 产品型号id
     */
    private Integer pnid;

    /**
     * 属于哪个产品系列
     */
    private Integer psid;

    /**
     * 产品型号名称
     */
    private String pnname;

    /**
     * 基础配置描述
     */
    private String description;

    /**
     * 基础价格
     */
    private Double price;

    /**
     * 差异性
     */
    private String diversity;

    private static final long serialVersionUID = 1L;

    public Integer getPnid() {
        return pnid;
    }

    public void setPnid(Integer pnid) {
        this.pnid = pnid;
    }

    public Integer getPsid() {
        return psid;
    }

    public void setPsid(Integer psid) {
        this.psid = psid;
    }

    public String getPnname() {
        return pnname;
    }

    public void setPnname(String pnname) {
        this.pnname = pnname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDiversity() {
        return diversity;
    }

    public void setDiversity(String diversity) {
        this.diversity = diversity;
    }
}