package com.example.sales.dao;


import com.example.sales.model.entity.ProductChain;

import java.util.List;

public interface ProductChainDao {

    int deleteByPrimaryKey(Integer pcid);

    int insert(ProductChain record);

    int insertSelective(ProductChain record);

    ProductChain selectByPrimaryKey(Integer pcid);

    int updateByPrimaryKeySelective(ProductChain record);

    int updateByPrimaryKey(ProductChain record);

    List<ProductChain> getProductChains();


}