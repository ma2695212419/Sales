package com.example.sales.model.entity;

import java.io.Serializable;

/**
 * product_chain
 * @author 
 */
public class ProductChain implements Serializable {
    /**
     * 产品线id
     */
    private Integer pcid;

    /**
     * 产品线名称
     */
    private String plname;

    private static final long serialVersionUID = 1L;

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    public String getPlname() {
        return plname;
    }

    public void setPlname(String plname) {
        this.plname = plname;
    }
}