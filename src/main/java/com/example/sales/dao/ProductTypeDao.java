package com.example.sales.dao;


import com.example.sales.model.entity.ProductType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface ProductTypeDao {
    int deleteByPrimaryKey(Integer ptid);

    int insert(ProductType record);

    int insertSelective(ProductType record);

    ProductType selectByPrimaryKey(Integer ptid);

    int updateByPrimaryKeySelective(ProductType record);

    int updateByPrimaryKey(ProductType record);

    List<ProductType> selectBypcid(Integer pcid);
}