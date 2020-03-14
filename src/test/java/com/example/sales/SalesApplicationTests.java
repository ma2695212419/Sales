package com.example.sales;

import cn.hutool.core.date.DateUtil;
import com.example.sales.dao.ConfigurationListDao;
import com.example.sales.dao.ConfiguringSingleDao;
import com.example.sales.dao.UserDao;
import com.example.sales.model.entity.User;
import com.example.sales.model.vo.AccessoriesList;
import com.example.sales.model.vo.Configuration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SalesApplicationTests {
    @Resource
    private UserDao userDao;
    @Resource
    private ConfigurationListDao configurationListDao;
    @Resource
    private ConfiguringSingleDao configuringSingleDao;

    @Test
    public void contextLoads() {


    }

}
