package com.example.sales.dao.front;


import com.example.sales.model.entity.ProductType;

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