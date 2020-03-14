package com.example.sales.service.back;

import com.example.sales.model.entity.ConfiguringSingle;
import com.example.sales.model.vo.Configuration;

import java.util.List;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/3/14 15:14
 * @package com.example.sales.service.back
 */
public interface ConfigurationService {

    List<Configuration> getConfiguration(Configuration configuration);

}
