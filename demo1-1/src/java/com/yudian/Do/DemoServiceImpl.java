package com.yudian.Do;

import com.yudian.bo.DemoService;
import com.yudian.model.User;

/**
 * Created by 10937 on 2017/5/21.
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello"+name;
    }

    @Override
    public User findUserById(long id) {
        User user=new User();
        user.setName("libai");
        user.setId(id);
        user.setAge(18);

        return user;
    }
}
