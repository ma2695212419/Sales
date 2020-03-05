package com.example.sales.dao.front;


import com.example.sales.model.entity.ProductSeries;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductSeriesDao {
    int deleteByPrimaryKey(Integer psid);

    int insert(ProductSeries record);

    int insertSelective(ProductSeries record);

    ProductSeries selectByPrimaryKey(Integer psid);

    int updateByPrimaryKeySelective(ProductSeries record);

    int updateByPrimaryKey(ProductSeries record);
}