package com.example.sales.dao.front;


import com.example.sales.model.entity.ConfigurationList;

public interface ConfigurationListDao {
    int deleteByPrimaryKey(Integer clid);

    int insert(ConfigurationList record);

    int insertSelective(ConfigurationList record);

    ConfigurationList selectByPrimaryKey(Integer clid);

    int updateByPrimaryKeySelective(ConfigurationList record);

    int updateByPrimaryKey(ConfigurationList record);
}