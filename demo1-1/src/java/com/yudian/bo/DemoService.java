package com.yudian.bo;

import com.yudian.model.User;

/**
 * Created by 10937 on 2017/5/21.
 */
public interface DemoService {
    public String sayHello(String name);

    public User findUserById(long id);
}
