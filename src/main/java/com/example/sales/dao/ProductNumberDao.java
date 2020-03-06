package com.example.sales.dao;


import com.example.sales.model.entity.ProductNumber;
import com.example.sales.model.vo.ProductNumberVo;

import java.util.List;

public interface ProductNumberDao {

    List<ProductNumberVo> getProductNumbers();

    int deleteByPrimaryKey(Integer pnid);

    int insert(ProductNumber record);

    int insertSelective(ProductNumber record);

    ProductNumber selectByPrimaryKey(Integer pnid);

    int updateByPrimaryKeySelective(ProductNumber record);

    int updateByPrimaryKey(ProductNumber record);

    List<ProductNumber> selectBypsid(Integer psid);
}