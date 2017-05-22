package com.yudian.bo;

import com.yudian.model.StuBasicInfo;
import com.yudian.model.StuCoursedyInfo;
import com.yudian.model.TeacherTimeTable;
import org.springframework.stereotype.Service;
import com.yudian.Do.CurdDo;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yudian-it on 2017/3/20.
 */
@Service("curdBo")
@Transactional
public class CurdBoImpl implements CurdBo {


   @Resource(name = "curdDo")
   CurdDo curdDo;

    @Override
    public String login(String userId, String password) {
        return curdDo.login(userId,password);
    }

    @Override
    public Boolean find(String userId,String password) {
        return curdDo.find( userId,password);
    }

    @Override
    public StuBasicInfo findStuBasicInfo(String id) {
        return curdDo.findStuBasicInfo(id);
    }
    public List<StuCoursedyInfo> showCourseInfo(String id){
        return curdDo.showCourseInfo(id);
    }

    @Override
    public Boolean changePaswd(String userId,String passwordOld,String passwordNew) {
        return curdDo.changePaswd(userId,passwordOld,passwordNew);
    }

    @Override
    public boolean changeStuInfo(StuBasicInfo stuInfo) {
        return curdDo.changeStuInfo(stuInfo);
    }

    @Override
    public boolean initPassword(String userId) {

        return curdDo.initPassword(userId);
    }

    @Override
    public boolean addUser(String userId) {


        return curdDo.addUser(userId);
    }

    @Override
    public List<String> findAllStuByCourseId(String courseId) {

        return curdDo.findAllStuByCourseId(courseId);
    }

    @Override
    public void addStuScore(List<String> score,List<String> stuId,String courseId) {
        curdDo.addStuScore(score,stuId,courseId);
    }

    @Override
    public List<TeacherTimeTable> findTimetableByTeacherId(String teacherId) {
        return curdDo.findTimetableByTeacherId(teacherId);
    }
}
