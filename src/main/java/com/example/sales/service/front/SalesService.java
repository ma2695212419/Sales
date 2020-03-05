package com.example.sales.service.front;

import com.example.sales.model.entity.User;

/**
 * @author 马泽朋
 * @version 1.0
 * @date 2020/3/5 下午 2:14
 */
public interface SalesService {
    /**
     * 根据账号密码登录
     * @param user
     * @return
     */
    public User loginByUserNameAndPassword(User user);
}
