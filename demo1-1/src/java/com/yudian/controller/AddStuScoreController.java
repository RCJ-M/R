package com.yudian.controller;


import com.yudian.bo.CurdBo;
import com.yudian.model.TeacherTimeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by yudian-it on 2017/3/28.
 */
@Controller
public class AddStuScoreController {
    @Autowired
    CurdBo curd;

    /**
     * 获取到教师ID，课程ID，查找该班级所有的学生
     * 并返回该班级所有学生的界面，还有填分数选项（addScore.jsp）
     *
     * @return
     */
    @RequestMapping(value = "/find_all_stu", method = RequestMethod.POST)
    public String findAllStudent(@RequestParam String courseId, ModelMap map) {

        List<String> list = curd.findAllStuByCourseId(courseId);
        map.addAttribute("stulist", list);
        map.addAttribute("courseId", courseId);
        return "addScore";
    }

    /**
     * 接受班级中学生的成绩，并录入数据库
     * 返回添加成功或失败页面
     *
     * @return
     */
    @RequestMapping(value = "/add_stu_score", method = RequestMethod.POST)
    public String addStuScoreController(@RequestParam(name = "score") List<String> score, @RequestParam(name = "stuId") List<String> stuId,
                                        @RequestParam(name = "courseId") String courseId) {

        curd.addStuScore(score, stuId, courseId);

        return "teacherLoginSucess";
    }

    /**
     * 接收教师的id，查询出课程表并返回
     * @param userId
     * @param map
     * @return
     */
    @RequestMapping(value = "/show_timetable/{userId}", method = RequestMethod.GET)
    public String showTimeTable(@PathVariable String userId ,ModelMap map) {


        List<TeacherTimeTable> list=curd.findTimetableByTeacherId(userId);
        map.addAttribute("timetable",list);
        return "showTimetable";
    }

}
