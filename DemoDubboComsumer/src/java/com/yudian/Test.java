package com.yudian;

import com.yudian.bo.DemoService;
import com.yudian.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yudian-it on 2017/4/26.
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        classPathXmlApplicationContext.start();
        DemoService demoService = (DemoService) classPathXmlApplicationContext.getBean("demoService");
        String string = demoService.sayHello("我的个神啊");
        System.out.println(string);
        User user=demoService.findUserById(1);
        System.out.println(user.toString());

        while (true){                      //用来保持程序不停止，方便在dubbo-main上面显示消费者

        }
    }
}
