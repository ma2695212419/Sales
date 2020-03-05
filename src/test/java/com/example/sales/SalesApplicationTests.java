package com.example.sales;

import com.example.sales.dao.front.UserDao;
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

    @Test
    public void contextLoads() {
        User user = new User();
        user.setUname("admin");
        user.setUpassword("admin");
        User user1 = userDao.loginByUserNameAndPassword(user);
        System.out.println(user1);
    }

}
