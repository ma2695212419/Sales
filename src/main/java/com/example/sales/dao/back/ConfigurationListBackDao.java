package com.example.sales.dao.back;


import com.example.sales.model.entity.ConfigurationList;
import org.apache.ibatis.annotations.Mapper;


public interface ConfigurationListBackDao {
    int deleteByPrimaryKey(Integer clid);

    int insert(ConfigurationList record);

    int insertSelective(ConfigurationList record);

    ConfigurationList selectByPrimaryKey(Integer clid);

    int updateByPrimaryKeySelective(ConfigurationList record);

    int updateByPrimaryKey(ConfigurationList record);
}