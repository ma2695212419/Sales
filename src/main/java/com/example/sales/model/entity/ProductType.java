package com.example.sales.model.entity;

import java.io.Serializable;
import java.util.List;

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
    /**
     * 产品系列
     */
    private List<ProductSeries> productSeriesList;
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
    public List<ProductSeries> getProductSeriesList() {
        return productSeriesList;
    }
    public void setProductSeriesList(List<ProductSeries> productSeriesList) {
        this.productSeriesList = productSeriesList;
    }
}