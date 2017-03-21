package com.yudian.Do;


import com.yudian.model.Login;
import org.hibernate.Query;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yudian-it on 2017/3/20.
 */
@Service("curdDo")
public class CurdDoImpl implements Curd {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Boolean find(String name, String password) {
        String hql = "from Login l where l.name=? and l.password=?";
        Session session = sessionFactory.getCurrentSession();
       Query query =session.createQuery(hql);
        query.setString(0,name);
        query.setString(1, password);
        Login login= (Login) query.uniqueResult();
        if (login!=null)
            return true;
        else
            return false;
    }
}
