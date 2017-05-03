package com.yudian.dubbo.api.service;

import com.yudian.dubbo.api.bo.DemoService;
import com.yudian.dubbo.api.model.User;

/**
 * Created by yudian-it on 2017/4/26.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "你好"+name;
    }

    @Override
    public User findUserById(long id) {
        User user=new User();
        user.setName("冉长江");
        user.setId(id);
        user.setAge(18);

        return user;
    }
}
