package ProxyPattern.staticProxyPattern;

public class test {

    public static void main(String[] args) {
        sailPublishProxy sailPublishProxy=new sailPublishProxy(); //创建静态代理对象
        sailPublishProxy.sailBook();
    }


}
