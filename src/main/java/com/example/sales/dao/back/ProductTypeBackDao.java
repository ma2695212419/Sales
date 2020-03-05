package com.example.sales.dao.back;


import com.example.sales.model.entity.ProductType;
import org.apache.ibatis.annotations.Mapper;


public interface ProductTypeBackDao {
    int deleteByPrimaryKey(Integer ptid);

    int insert(ProductType record);

    int insertSelective(ProductType record);

    ProductType selectByPrimaryKey(Integer ptid);

    int updateByPrimaryKeySelective(ProductType record);

    int updateByPrimaryKey(ProductType record);
}