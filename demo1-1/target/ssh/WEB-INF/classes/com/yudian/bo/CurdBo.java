package com.yudian.bo;

import com.yudian.model.StuBasicInfo;
import com.yudian.model.StuCoursedyInfo;
import com.yudian.model.TeacherTimeTable;

import java.util.List;

/**
 * Created by yudian-it on 2017/3/20.
 */
public interface CurdBo {
    String login(String userId,String password);//用户登录验证

    Boolean find(String userId,String password);//从数据库中查询用户是否存在

    StuBasicInfo findStuBasicInfo(String id);//通过学号查找学生的基本（个人）信息

    List<StuCoursedyInfo> showCourseInfo(String id);//此方法的功能为学生查看自己的课程相关信息（课程名称，成绩，绩点等）

    Boolean changePaswd(String userId,String passwordOld,String passwordNew);//此方法为用户修改登录密码，包括学生和教师，不用区分学生和教师。通过用户id字长加以区别

    boolean changeStuInfo(StuBasicInfo stuInfo);//修改学生的基本信息（只有学生自己有权修改）

    boolean initPassword(String userId);//初始化用户密码

    boolean addUser(String userId);  //增加用户（学生或者教师）

    List<String> findAllStuByCourseId(String courseId);  //查找出选了某门课程的同学的ID

    void addStuScore(List<String> score,List<String> stuId,String courseId);  //将教师输入的学生成绩放入学生成绩表


    List<TeacherTimeTable> findTimetableByTeacherId(String teacherId);   //根据教师id获取教师的课程表

}
