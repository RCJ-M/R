package com.yudian.controller;

import com.yudian.bo.CurdBo;
import com.yudian.model.StuBasicInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yudian-it on 2017/3/24.
 */
@Controller
public class ChangeBaseInfoController {
    @Autowired
    CurdBo curd;

    @RequestMapping(value = "/StuInfo",method = RequestMethod.POST)
    public ModelAndView StiInfo(String id,ModelMap map){
        map.addAttribute("id", id);
        return new ModelAndView("StuInfo", "command", new StuBasicInfo());
    }
    @RequestMapping(value = "/ChangeStuInfo" ,method = RequestMethod.POST)
    public String ChangInfo(StuBasicInfo stu ,ModelMap map){
        map.addAttribute("userId", stu.getId());

        curd.changeStuInfo(stu);
        return "stuLoginSucess";
    }

}
