package com.example.sales.service.back.impl;

import com.example.sales.dao.ConfiguringSingleDao;
import com.example.sales.model.entity.ConfiguringSingle;
import com.example.sales.model.vo.Configuration;
import com.example.sales.service.back.ConfigurationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2020/3/14 15:14
 * @package com.example.sales.service.back.impl
 */
@Service
public class ConfigurationServiceImpl implements ConfigurationService {

    @Resource
    private ConfiguringSingleDao configuringSingleDao;

    @Override
    public List<Configuration> getConfiguration(Configuration configuration) {
        return configuringSingleDao.getConfiguration(configuration);
    }
}
