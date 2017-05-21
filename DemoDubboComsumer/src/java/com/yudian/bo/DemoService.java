package com.yudian.bo;

import com.yudian.model.User;

/**
 * Created by yudian-it on 2017/4/26.
 */
public interface DemoService {
        public String sayHello(String name);

        public User findUserById(long id);
}
