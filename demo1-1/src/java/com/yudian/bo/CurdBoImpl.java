package com.yudian.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yudian.Do.Curd;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by yudian-it on 2017/3/20.
 */
@Service("curdBo")
@Transactional
public class CurdBoImpl implements CurdBo {


   @Resource(name = "curdDo")
   Curd curd;
    @Override
    public Boolean find(String name,String password) {
        return curd.find( name,password);
    }
}
