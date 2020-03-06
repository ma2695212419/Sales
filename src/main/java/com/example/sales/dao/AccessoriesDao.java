package com.example.sales.dao;

import com.example.sales.model.entity.Accessories;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccessoriesDao {

    List<Accessories> getAccessories();

    int deleteByPrimaryKey(Integer aid);

    int insert(Accessories record);

    int insertSelective(Accessories record);

    Accessories selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Accessories record);

    int updateByPrimaryKey(Accessories record);
}