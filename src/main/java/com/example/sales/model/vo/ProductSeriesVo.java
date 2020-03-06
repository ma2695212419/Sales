package com.example.sales.model.vo;

import com.example.sales.model.entity.ProductNumber;
import com.example.sales.model.entity.ProductType;

import java.io.Serializable;
import java.util.List;

/**
 * product_series
 *
 * @author
 */
public class ProductSeriesVo implements Serializable {
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
     * 隶属产品类型
     */
    private ProductType productType;

    private static final long serialVersionUID = 2563665081608692905L;

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

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

}