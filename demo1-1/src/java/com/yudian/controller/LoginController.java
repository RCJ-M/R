package com.yudian.controller;

import com.yudian.bo.CurdBo;
import com.yudian.model.Login;
import com.yudian.model.StuBasicInfo;
import com.yudian.model.StuCoursedyInfo;
import com.yudian.model.TeacherTimeTable;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by yudian-it on 2017/3/20.
 */
@Controller
public class LoginController {

    @Autowired
    CurdBo curd;

    /**
     * 用户登录
     *
     * @param name
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "name") String name, @RequestParam(value = "password") String password,ModelMap map) {
        String infoback = curd.login(name, password);
        map.addAttribute("userId", name);
        if (infoback != null) {
            if (infoback.equals("stu")) {
                return "stuLoginSucess";
            } else if (infoback.equals("teacher")) { //如果用户是教师的话，增加返回字段courseList，通过教师id查找出所有课程编号并返回
                List courseList = new ArrayList();
                for (TeacherTimeTable t:curd.findTimetableByTeacherId(name)) {
                    String id=t.getId();
                    courseList.add(id);
                }
                map.addAttribute("courseList", courseList);
                return "teacherLoginSucess";
            } else if (infoback.equals("admin")) {
                return "adminLoginSucess";
            }
        }
        return "Loginfail";
    }

    /**
     * 路径跳转
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/redirect/{name}", method = RequestMethod.GET)
    public String success(@PathVariable String name) {

        if (name.equals("admin")) {
            return "adminLoginSucess";
        }
        else if(name.equals("teacher")){
            return "teacherLoginSucess";
        }else if (name.equals("student")){
            return "stuLoginSucess";
        }
        return "sucess";
    }

    /**
     * 显示学生基本信息
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/view_stu_info", method = RequestMethod.POST)
    public String ViewStuInfo(@RequestParam(value = "id") String id, ModelMap model) {

        StuBasicInfo stuBasicInfo = curd.findStuBasicInfo(id);
        model.addAttribute("user",stuBasicInfo);
        return "stuBasicInfo";
    }

    /**
     * 显示学生课程成绩
     *
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/show_course_info", method = RequestMethod.POST)
    public String showCourseInfo(@RequestParam String id, ModelMap modelMap) {

        List<StuCoursedyInfo> list = curd.showCourseInfo(id);
        modelMap.addAttribute("list", list);
        return "stuCourseInfo";
    }

    /**
     * 修改用户密码
     *
     * @param id
     * @param passwordOld
     * @param passwordNew
     * @return
     */
    @RequestMapping(value = "/change_Paswd_Stu", method = RequestMethod.POST)
    public String changePaswdStu(@RequestParam String id, @RequestParam String passwordOld, @RequestParam String passwordNew) {

        boolean b = curd.changePaswd(id, passwordOld, passwordNew);
        if (b) {
            return "changePaswdSeccess";
        }
        return "changePaswdFail";
    }

    /**
     * 初始化用户密码
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "/init_password", method = RequestMethod.POST)
    public String initPassword(String userId , String adminId,ModelMap map) {
        boolean b = curd.initPassword(userId);
        if (b) {
            map.addAttribute("userId", adminId);
            return "adminLoginSucess";
        }
        return "initFail";
    }
    /**
     * 增加用户（学生或者教师）
     */
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(String userId){
        if(userId.length()==4||userId.length()==12)

        {
            curd.addUser(userId);
            return "addUserSucess";

        }
        else
            return "addUserFail";

    }


}
