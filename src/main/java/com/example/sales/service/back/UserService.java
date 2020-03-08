package com.example.sales.service.back;

import com.example.sales.model.entity.User;

import java.util.List;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/3/8 14:54
 * @package com.example.sales.service.back
 */
public interface UserService {

    List<User> getAllUser();

    boolean insertSelective(User record);

    boolean updateByPrimaryKeySelective(User record);

}
