import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yudian-it on 2017/4/26.
 */
public class provider {
    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        context.start();

        System.in.read(); // 按任意键退出
    }
}
