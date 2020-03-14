package com.example.sales.dao;

import com.example.sales.model.entity.ConfigurationList;
import com.example.sales.model.vo.AccessoriesList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ConfigurationListDao {
    int deleteByPrimaryKey(String clid);

    int insert(ConfigurationList record);

    int insertSelective(ConfigurationList record);

    ConfigurationList selectByPrimaryKey(String clid);

    int updateByPrimaryKeySelective(ConfigurationList record);

    int updateByPrimaryKey(ConfigurationList record);

    List<AccessoriesList> selectInfo();
}