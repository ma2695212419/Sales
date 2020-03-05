package com.example.sales.dao.front;


import com.example.sales.model.entity.ProductNumber;

public interface ProductNumberDao {
    int deleteByPrimaryKey(Integer pnid);

    int insert(ProductNumber record);

    int insertSelective(ProductNumber record);

    ProductNumber selectByPrimaryKey(Integer pnid);

    int updateByPrimaryKeySelective(ProductNumber record);

    int updateByPrimaryKey(ProductNumber record);
}