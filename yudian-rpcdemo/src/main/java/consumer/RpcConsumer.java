package consumer;

/*
 * Copyright 2011 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
import api.HelloService;
import framework.RpcFramework;
import provider.HelloServiceImpl;
import provider.HelloServieceImpl1;

/**
 * consumer.RpcConsumer
 *
 * @author william.liangf
 */
public class RpcConsumer {

    public static void main(String[] args) throws Exception {
        HelloService service = RpcFramework.refer(HelloService.class, "127.0.0.1", 1234);
        for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            String hello1 = service.hello("World" + i);
            String hello = service.hello("rcj", "china");
            System.out.println(hello);
            System.out.println(hello1);
            Thread.sleep(1000);
        }
    }

}
