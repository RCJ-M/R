package test;

import com.yudian.bo.CurdBo;
import com.yudian.bo.DemoService;
import com.yudian.model.StuBasicInfo;
import com.yudian.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yudian-it on 2017/3/20.
 */
public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        classPathXmlApplicationContext.start();
        DemoService demoService = (DemoService) classPathXmlApplicationContext.getBean("demoService");
        boolean a=demoService.find("1024", "111111");
        System.out.println(a);

        while (true){                      //用来保持程序不停止，方便在dubbo-main上面显示消费者

        }

    }

}
