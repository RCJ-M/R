package com.yudian.service;

import com.yudian.bo.DemoService;
import com.yudian.model.Login;

import org.hibernate.Query;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by yudian-it on 2017/4/26.
 */
public class DemoServiceImpl implements DemoService {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Boolean find(String userId, String password) {
        String hql = "from Login l where l.userId=? and l.password=?";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        query.setString(0, userId);
        query.setString(1, password);
        Login login = (Login) query.uniqueResult();
        if (login != null)
            return true;
        else
            return false;

    }
}
