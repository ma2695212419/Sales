package com.example.sales.dao.front;


import com.example.sales.model.entity.ConfiguringSingle;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ConfiguringSingleDao {
    int deleteByPrimaryKey(String cid);

    int insert(ConfiguringSingle record);

    int insertSelective(ConfiguringSingle record);

    ConfiguringSingle selectByPrimaryKey(String cid);

    int updateByPrimaryKeySelective(ConfiguringSingle record);

    int updateByPrimaryKey(ConfiguringSingle record);
}