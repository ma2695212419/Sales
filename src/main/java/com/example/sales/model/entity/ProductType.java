package com.example.sales.model.entity;

import java.io.Serializable;

/**
 * product_type
 * @author 
 */
public class ProductType implements Serializable {
    /**
     * 产品类别编号
     */
    private Integer ptid;

    /**
     * 属于哪个产品线
     */
    private Integer pcid;

    /**
     * 产品类别名称
     */
    private String ptname;

    private static final long serialVersionUID = 1L;

    public Integer getPtid() {
        return ptid;
    }

    public void setPtid(Integer ptid) {
        this.ptid = ptid;
    }

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    public String getPtname() {
        return ptname;
    }

    public void setPtname(String ptname) {
        this.ptname = ptname;
    }
}