package ProxyPattern.DynamicProxyPattern;

import java.lang.reflect.Proxy;

public class test {

    public static void main(String[] args) {
        sailPublish sailPublish=new sailPublish();
        myHandler myHandler=new myHandler(sailPublish); //创建代理对象，将要代理的类传进去
        sail sail = (ProxyPattern.DynamicProxyPattern.sail) Proxy.newProxyInstance(myHandler.getClass().getClassLoader(),
                sailPublish.getClass().getInterfaces(), myHandler); //这里注意要用父类接口接受
        sail.sailBook();
    }
}
