package com.yudian.Do;



import com.yudian.model.Login;
import com.yudian.model.StuBasicInfo;
import com.yudian.model.StuCoursedyInfo;
import org.hibernate.Query;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yudian-it on 2017/3/20.
 */
@Service("curdDo")
public class CurdDoImpl implements CurdDo {

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

    @Override
    public StuBasicInfo findStuBasicInfo(String id) {

        StuBasicInfo stuBasicInfo= (StuBasicInfo) sessionFactory.getCurrentSession().get(StuBasicInfo.class, id);
        if(null!=stuBasicInfo){
            return stuBasicInfo;
        }

        else
            return null;
    }
    public List<StuCoursedyInfo> showCourseInfo(){
        String stuid="a";
        String hql="from StuCoursedyInfo s where s.stuId=? ";
        Query query=sessionFactory.getCurrentSession().createQuery(hql);
        query.setString(0,stuid);
         List<StuCoursedyInfo> list= query.list();
        return list;
    }
}
