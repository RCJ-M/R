package com.yudian.bo;

import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yudian-it on 2017/4/26.
 */
@Transactional
public interface DemoService {

    public Boolean find(String userId, String password);
}
