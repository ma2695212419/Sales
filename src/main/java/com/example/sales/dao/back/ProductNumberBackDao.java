package com.example.sales.dao.back;


import com.example.sales.model.entity.ProductNumber;
import org.apache.ibatis.annotations.Mapper;


public interface ProductNumberBackDao {
    int deleteByPrimaryKey(Integer pnid);

    int insert(ProductNumber record);

    int insertSelective(ProductNumber record);

    ProductNumber selectByPrimaryKey(Integer pnid);

    int updateByPrimaryKeySelective(ProductNumber record);

    int updateByPrimaryKey(ProductNumber record);
}