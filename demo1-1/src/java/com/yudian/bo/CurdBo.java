package com.yudian.bo;

import com.yudian.model.StuBasicInfo;
import com.yudian.model.StuCoursedyInfo;

import java.util.List;

/**
 * Created by yudian-it on 2017/3/20.
 */
public interface CurdBo {
    Boolean find(String name,String password);//用户登录验证
    StuBasicInfo findStuBasicInfo(String id);//通过学号查找学生的基本（个人）信息
    List<StuCoursedyInfo> showCourseInfo(String id);//此方法的功能为学生查看自己的课程相关信息（课程名称，成绩，绩点等）
}
