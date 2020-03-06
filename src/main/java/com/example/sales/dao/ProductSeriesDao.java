package com.example.sales.dao;


import com.example.sales.model.entity.ProductSeries;
import com.example.sales.model.vo.ProductSeriesVo;

import java.util.List;

public interface ProductSeriesDao {

    List<ProductSeriesVo> getProductSeries();

    int deleteByPrimaryKey(Integer psid);

    int insert(ProductSeries record);

    int insertSelective(ProductSeries record);

    ProductSeries selectByPrimaryKey(Integer psid);

    int updateByPrimaryKeySelective(ProductSeries record);

    int updateByPrimaryKey(ProductSeries record);

    List<ProductSeries> selectByptid(Integer ptid);
}