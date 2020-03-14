package com.example.sales.service.back.impl;

import com.example.sales.dao.ConfigurationDao;
import com.example.sales.model.vo.ConfigurationVo;
import com.example.sales.service.back.ConfigurationService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/3/14 15:14
 * @package com.example.sales.service.back.impl
 */
@Service
public class ConfigurationServiceImpl implements ConfigurationService {

    @Resource
    private ConfigurationDao configurationDao;

    @Override
    public List<ConfigurationVo> getConfiguration(ConfigurationVo configurationVo) {
        return configurationDao.getConfiguration(configurationVo);
    }

}
