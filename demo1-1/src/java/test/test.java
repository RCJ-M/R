package test;

import com.yudian.bo.CurdBo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yudian-it on 2017/3/20.
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        CurdBo curdBo = (CurdBo) applicationContext.getBean("curdBo");
        Boolean b=curdBo.find("rcj", "123456");
        System.out.println(b);
    }

}
