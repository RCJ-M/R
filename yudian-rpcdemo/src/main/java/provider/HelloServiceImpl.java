package provider;

import api.HelloService;

/**
 * Created by tang on 16/8/24.
 */
public class HelloServiceImpl implements HelloService {
    public String hello(String name) {
        return "Hello " + name;
    }

    @Override
    public String hello(String name, String country) {
        return "i am "+name+ "i come form"+country;
    }
}
