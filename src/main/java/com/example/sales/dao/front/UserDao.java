package com.example.sales.dao.front;

import com.example.sales.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

public interface UserDao {
    int deleteByPrimaryKey(String uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String uname,String upassword);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User loginByUserNameAndPassword(User user);
}