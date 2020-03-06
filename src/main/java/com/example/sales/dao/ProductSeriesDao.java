package com.example.sales.dao;


import com.example.sales.model.entity.ProductSeries;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface ProductSeriesDao {
    int deleteByPrimaryKey(Integer psid);

    int insert(ProductSeries record);

    int insertSelective(ProductSeries record);

    ProductSeries selectByPrimaryKey(Integer psid);

    int updateByPrimaryKeySelective(ProductSeries record);

    int updateByPrimaryKey(ProductSeries record);

    List<ProductSeries> selectByptid(Integer ptid);
}