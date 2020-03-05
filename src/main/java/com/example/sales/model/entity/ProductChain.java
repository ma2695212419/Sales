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
    private String pcname;

    private static final long serialVersionUID = 1L;

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    public String getPcname() {
        return pcname;
    }

    public void setPcname(String pcname) {
        this.pcname = pcname;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "ProductChain{" +
                "pcid=" + pcid +
                ", pcname='" + pcname + '\'' +
                '}';
    }
}