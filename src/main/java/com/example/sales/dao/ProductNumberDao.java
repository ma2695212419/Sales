package com.example.sales.dao;


import com.example.sales.model.entity.ProductNumber;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface ProductNumberDao {
    int deleteByPrimaryKey(Integer pnid);

    int insert(ProductNumber record);

    int insertSelective(ProductNumber record);

    ProductNumber selectByPrimaryKey(Integer pnid);

    int updateByPrimaryKeySelective(ProductNumber record);

    int updateByPrimaryKey(ProductNumber record);

    List<ProductNumber> selectBypsid(Integer psid);
}