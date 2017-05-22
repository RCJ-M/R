package com.yudian.bo;

import com.yudian.model.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yudian-it on 2017/4/26.
 */
@Transactional
public interface DemoService {
    public String sayHello(String name);

    public User findUserById(long id);
    public Boolean find(String userId, String password);
}
