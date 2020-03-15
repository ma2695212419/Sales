package com.example.sales.model.entity;

import java.io.Serializable;
import java.util.List;

/**
 * product_series
 * @author 
 */
public class ProductSeries implements Serializable {
    /**
     * 产品系列id
     */
    private Integer psid;

    /**
     * 产品类型id
     */
    private Integer ptid;

    /**
     * 产品系列名称
     */
    private String psname;

    /**
     * 产品型号
     */
    List<ProductNumber> productNumberList;

    public List<ProductNumber> getProductNumberList() {
        return productNumberList;
    }

    public void setProductNumberList(List<ProductNumber> productNumberList) {
        this.productNumberList = productNumberList;
    }

    private static final long serialVersionUID = 1L;

    public Integer getPsid() {
        return psid;
    }

    public void setPsid(Integer psid) {
        this.psid = psid;
    }

    public Integer getPtid() {
        return ptid;
    }

    public void setPtid(Integer ptid) {
        this.ptid = ptid;
    }

    public String getPsname() {
        return psname;
    }

    public void setPsname(String psname) {
        this.psname = psname;
    }

    @Override
    public String toString() {
        return "ProductSeries{" +
                "psid=" + psid +
                ", ptid=" + ptid +
                ", psname='" + psname + '\'' +
                ", productNumberList=" + productNumberList +
                '}';
    }
}