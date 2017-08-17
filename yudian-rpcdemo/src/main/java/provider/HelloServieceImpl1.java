package provider;

import api.HelloService;

public class HelloServieceImpl1 implements HelloService {
    @Override
    public String hello(String name) {
        return "hello 2:"+name;
    }

    @Override
    public String hello(String name, String country) {
        return "i am "+name+"i love"+country;
    }
}
