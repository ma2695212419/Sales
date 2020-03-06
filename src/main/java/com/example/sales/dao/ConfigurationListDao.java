package com.example.sales.dao;


import com.example.sales.model.entity.ConfigurationList;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ConfigurationListDao {
    int deleteByPrimaryKey(Integer clid);

    int insert(ConfigurationList record);

    int insertSelective(ConfigurationList record);

    ConfigurationList selectByPrimaryKey(Integer clid);

    int updateByPrimaryKeySelective(ConfigurationList record);

    int updateByPrimaryKey(ConfigurationList record);
}