package com.yudian.Do;


import com.yudian.bo.DemoService;
import com.yudian.model.Login;
import com.yudian.model.StuBasicInfo;
import com.yudian.model.StuCoursedyInfo;
import com.yudian.model.TeacherTimeTable;
import org.hibernate.Query;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yudian-it on 2017/3/20.
 */
@Service("curdDo")
public class CurdDoImpl implements CurdDo {

    private static int STU_LEN = 12;//学生用户
    private static int TEACHER_LEN = 4;//教师用户
    private static String ADMIN = "admin";//管理员用户

    @Autowired
    SessionFactory sessionFactory;

    /**
     * 用户登录验证
     */
    @Override
    public String login(String userId, String password) {
        boolean b = find(userId, password);
        if (b) {
            int len = userId.length();
            if (STU_LEN == len) {
                return "stu";
            } else if (TEACHER_LEN == len) {
                return "teacher";
            } else if (ADMIN.equals(userId)) {
                return "admin";
            }
        }
        return null;
    }



    /**
     * 从数据库查找用户（是否存在)
     */
    @Override
    public Boolean find(String userId, String password) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        classPathXmlApplicationContext.start();
        DemoService demoService = (DemoService) classPathXmlApplicationContext.getBean("demoService");
        boolean a=demoService.find(userId,password);

        return a;
        /* String hql = "from Login l where l.userId=? and l.password=?";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        query.setString(0, userId);
        query.setString(1, password);
        Login login = (Login) query.uniqueResult();
        if (login != null)
            return true;
        else
            return false;*/
    }

    /*

    查看学生基本信息
     */
    @Override
    public StuBasicInfo findStuBasicInfo(String id) {

        StuBasicInfo stuBasicInfo = (StuBasicInfo) sessionFactory.getCurrentSession().get(StuBasicInfo.class, id);
        if (null != stuBasicInfo) {
            return stuBasicInfo;
        } else
            return null;
    }

    /*

    查看学生课程成绩
     */
    @Override
    public List<StuCoursedyInfo> showCourseInfo(String id) {
        String hql = "from StuCoursedyInfo s where s.stuId=? ";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString(0, id);
        List<StuCoursedyInfo> list = query.list();
        return list;
    }

    /**
     * 更改用户密码
     */
    @Override
    public Boolean changePaswd(String userId, String passwordOld, String passwordNew) {

        Boolean find = this.find(userId, passwordOld);
        if (find) {
            Login login = (Login) sessionFactory.getCurrentSession().get(Login.class, userId);
            login.setPassword(passwordNew);
            if (sessionFactory.getCurrentSession().save(login) != null)
                return true;
            else
                return false;
        } else {

            return false;
        }

    }

    /**
     * @param stuInfo
     * @return 修改学生基本信息
     */

    @Override
    public boolean changeStuInfo(StuBasicInfo stuInfo) {

        sessionFactory.getCurrentSession().update(stuInfo);

        return true;
    }

    /**
     * 初始化用户密码为： 000000
     *
     * @param userId
     * @return
     */
    @Override
    public boolean initPassword(String userId) {
        Login login = (Login) sessionFactory.getCurrentSession().get(Login.class, userId);
        if (login != null) {
            login.setPassword("000000");
            sessionFactory.getCurrentSession().save(login);
            return true;
        }
        return false;
    }

    @Override
    public boolean addUser(String userId) {
        Login login = new Login();
        login.setUserId(userId);
        login.setPassword("000000");
        sessionFactory.getCurrentSession().save(login);
        return true;
    }

    @Override
    public List<String> findAllStuByCourseId(String courseId) {

        String hql = "select s.stuId from StuCoursedyInfo s where s.courseId = ?";
        List<String> list = sessionFactory.getCurrentSession().createQuery(hql).setString(0, courseId).list();
        return list;
    }

    @Override
    public void addStuScore(List<String> score, List<String> stuId, String courseId) {
        String sql = "UPDATE stu_course_info s SET s.courseScore=? WHERE s.stuId=? AND s.courseId=?";

        for (int i = 0; i < stuId.size(); i++) {
            sessionFactory.getCurrentSession().createSQLQuery(sql).setString(0, score.get(i)).setString(1, stuId.get(i)).setString(2, courseId).executeUpdate();
        }
    }

    @Override
    public List<TeacherTimeTable> findTimetableByTeacherId(String teacherId) {
        String sql = "select t.id from TeacherTimeTable t where  t.teacherId=?";
        List<String> list = sessionFactory.getCurrentSession().createQuery(sql).setString(0, teacherId).list();
        List<TeacherTimeTable> list1 = new ArrayList();
        for (String l : list) {
            TeacherTimeTable table = (TeacherTimeTable) sessionFactory.getCurrentSession().get(TeacherTimeTable.class, l);
            list1.add(table);
        }

        return list1;
    }
}
