package com.example.sales.model.vo;

import com.example.sales.model.entity.ProductChain;

import java.io.Serializable;
import java.util.List;

/**
 * product_type
 *
 * @author
 */
public class ProductTypeVo implements Serializable {
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
     * 隶属产品线
     */
    private ProductChain productChain;

    private static final long serialVersionUID = 2125240903825269053L;

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

    public ProductChain getProductChain() {
        return productChain;
    }

    public void setProductChain(ProductChain productChain) {
        this.productChain = productChain;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}