package com.example.learn.aop;

public class TestAop {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        HelloService proxy = (HelloService)ProxyBean.getProxyBean(helloService,new MyInterceptor());
        proxy.sayHello("小明");
        System.out.println("\n################name is null #################\n");
        proxy.sayHello(null);
    }
}
