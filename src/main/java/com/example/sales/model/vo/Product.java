package com.example.sales.model.vo;

import com.example.sales.model.entity.ProductType;

import java.util.List;

/**
 * @author 马泽朋
 * @version 1.0
 * @date 2020/3/5 下午 4:24
 */
public class Product {
    /**
     * 产品线id
     */
    private Integer pcid;

    /**
     * 产品线名称
     */
    private String pcname;

    private List<ProductType> productTypeList;


    @Override
    public String toString() {
        return "Product{" +
                "pcid=" + pcid +
                ", pcname='" + pcname + '\'' +
                ", productTypeList=" + productTypeList +
                '}';
    }

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

    public List<ProductType> getProductTypeList() {
        return productTypeList;
    }

    public void setProductTypeList(List<ProductType> productTypeList) {
        this.productTypeList = productTypeList;
    }
}
