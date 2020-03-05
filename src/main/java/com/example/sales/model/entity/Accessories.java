package com.example.sales.model.entity;

import java.io.Serializable;

/**
 * accessories
 * @author 
 */
public class Accessories implements Serializable {
    /**
     * 配件编号
     */
    private Integer aid;

    /**
     * 配件名称
     */
    private String aname;

    /**
     * 配件描述
     */
    private String description;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 配件单价
     */
    private Double price;

    /**
     * 备注
     */
    private String note;

    private static final long serialVersionUID = 1L;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}