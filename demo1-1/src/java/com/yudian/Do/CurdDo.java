package com.yudian.Do;

import com.yudian.model.StuBasicInfo;
import com.yudian.model.StuCoursedyInfo;
import com.yudian.model.TeacherTimeTable;

import java.util.List;

/**
 * Created by yudian-it on 2017/3/20.
 */
public interface CurdDo {
    String login(String userId,String password);
    Boolean find(String userId,String password);
    StuBasicInfo findStuBasicInfo(String id);
    List<StuCoursedyInfo> showCourseInfo(String id);
    Boolean changePaswd(String userId,String passwordOld,String passwordNew);
    boolean changeStuInfo(StuBasicInfo stuInfo);
    boolean initPassword(String userId);
    boolean addUser(String userId);
    List<String> findAllStuByCourseId(String courseId);
    void addStuScore(List<String> score,List<String> stuId,String courseId);
    List<TeacherTimeTable> findTimetableByTeacherId(String teacherId);
}
