package com.yudian.controller;

import com.yudian.bo.CurdBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;


/**
 * Created by yudian-it on 2017/3/20.
 */
@Controller
public class LoginController {

   @Autowired
    CurdBo curd;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "name") String name,@RequestParam(value = "password") String password) {
        if (curd.find(name,password))
        return "sucess";
        else
            return "fail";

    }
}
