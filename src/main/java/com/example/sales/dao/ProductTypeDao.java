package com.example.sales.dao;


import com.example.sales.model.entity.ProductType;
import com.example.sales.model.vo.ProductTypeVo;

import java.util.List;

public interface ProductTypeDao {

    List<ProductTypeVo> getProductTypes();

    int deleteByPrimaryKey(Integer ptid);

    int insert(ProductType record);

    int insertSelective(ProductType record);

    ProductType selectByPrimaryKey(Integer ptid);

    int updateByPrimaryKeySelective(ProductType record);

    int updateByPrimaryKey(ProductType record);

    List<ProductType> selectBypcid(Integer pcid);
}