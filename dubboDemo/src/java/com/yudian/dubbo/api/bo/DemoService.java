package com.yudian.dubbo.api.bo;

import com.yudian.dubbo.api.model.User;

/**
 * Created by yudian-it on 2017/4/26.
 */
public interface DemoService {
    public String sayHello(String name);

    public  User findUserById(long id);
}
