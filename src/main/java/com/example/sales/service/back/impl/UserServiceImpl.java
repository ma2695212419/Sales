package com.example.sales.service.back.impl;

import com.example.sales.dao.UserDao;
import com.example.sales.model.entity.User;
import com.example.sales.service.back.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2020/3/8 14:54
 * @package com.example.sales.service.back.impl
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    @Transactional
    public boolean insertSelective(User record) {
        int insert = userDao.insertUser(record);
        if (insert > 0) {
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean updateByPrimaryKeySelective(User record) {
        int i = userDao.updateByPrimaryKeySelective(record);
        if (i>0){
            return true;
        }
        return false;
    }
}
