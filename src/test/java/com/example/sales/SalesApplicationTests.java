package com.example.sales;

import com.example.sales.dao.ProductNumberDao;
import com.example.sales.dao.UserDao;
import com.example.sales.model.entity.ProductNumber;
import com.example.sales.model.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SalesApplicationTests {
    @Resource
    private UserDao userDao;

    @Resource
    private ProductNumberDao productNumberDao;

    @Test
    public void contextLoads() {

    }

}
