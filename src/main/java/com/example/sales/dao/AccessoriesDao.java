package com.example.sales.dao;

import com.example.sales.model.entity.Accessories;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccessoriesDao {
    int deleteByPrimaryKey(Integer aid);

    int insert(Accessories record);

    int insertSelective(Accessories record);

    Accessories selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Accessories record);

    int updateByPrimaryKey(Accessories record);
}