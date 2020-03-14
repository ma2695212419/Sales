package com.example.sales.dao;

import com.example.sales.model.vo.ConfigurationVo;

import java.util.List;


/**
 * @author 王雨
 * @version 1.0
 * @date 2020/3/14 14:28
 * @package com.example.sales.dao
 */
public interface ConfigurationDao {

    List<ConfigurationVo> getConfiguration(ConfigurationVo configurationVo);
}
