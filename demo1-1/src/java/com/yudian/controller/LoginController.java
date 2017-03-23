package com.yudian.controller;

import com.yudian.bo.CurdBo;
import com.yudian.model.StuBasicInfo;
import com.yudian.model.StuCoursedyInfo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.List;


/**
 * Created by yudian-it on 2017/3/20.
 */
@Controller
public class LoginController {

    @Autowired
    CurdBo curd;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "name") String name, @RequestParam(value = "password") String password) {
        if (curd.find(name, password))
            return "sucess";
        else
            return "fail";

    }

    @RequestMapping(value = "/view_stu_info", method = RequestMethod.POST)
    public String ViewStuInfo(@RequestParam(value = "id") String id, ModelMap model) {

        StuBasicInfo stuBasicInfo = curd.findStuBasicInfo(id);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        model.addAttribute("name", stuBasicInfo.getName());
        model.addAttribute("id", stuBasicInfo.getId());
        model.addAttribute("sex", stuBasicInfo.getSex());
        model.addAttribute("address", stuBasicInfo.getAddress());
        model.addAttribute("birthday", format.format(stuBasicInfo.getBirthday()));
        model.addAttribute("email", stuBasicInfo.getEmail());
        model.addAttribute("religon", stuBasicInfo.getReligon());
        model.addAttribute("nation", stuBasicInfo.getNation());
        model.addAttribute("phone", stuBasicInfo.getPhone());

        return "stuBasicInfo";
    }

    @RequestMapping(value = "/show_course_info", method = RequestMethod.POST)
    public String showCourseInfo(@RequestParam String id, ModelMap modelMap) {

        List<StuCoursedyInfo> list=curd.showCourseInfo(id);
        modelMap.addAttribute("list",list);
        return "stuCourseInfo";
    }
}
