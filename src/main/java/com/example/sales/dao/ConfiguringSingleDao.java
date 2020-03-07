package com.example.sales.dao;


import com.example.sales.model.entity.ConfiguringSingle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ConfiguringSingleDao {
    int deleteByPrimaryKey(String cid);

    int insert(ConfiguringSingle record);

    int insertSelective(ConfiguringSingle record);

    ConfiguringSingle selectByPrimaryKey(String cid);

    int updateByPrimaryKeySelective(ConfiguringSingle record);

    int updateByPrimaryKey(ConfiguringSingle record);

    List<ConfiguringSingle> selectAll();
}