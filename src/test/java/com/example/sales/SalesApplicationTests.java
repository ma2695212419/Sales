package com.example.sales;

import com.example.sales.dao.ConfigurationListDao;
import com.example.sales.dao.UserDao;
import com.example.sales.model.entity.User;
import com.example.sales.model.vo.AccessoriesList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SalesApplicationTests {
    @Resource
    private UserDao userDao;
    @Resource
    private ConfigurationListDao configurationListDao;

    @Test
    public void contextLoads() {
        List<AccessoriesList> accessoriesLists = configurationListDao.selectInfo();
        System.out.println(accessoriesLists);
    }

}
