package com.example.sales.dao.front;


import com.example.sales.model.entity.ProductChain;

public interface ProductChainDao {
    int deleteByPrimaryKey(Integer pcid);

    int insert(ProductChain record);

    int insertSelective(ProductChain record);

    ProductChain selectByPrimaryKey(Integer pcid);

    int updateByPrimaryKeySelective(ProductChain record);

    int updateByPrimaryKey(ProductChain record);
}