package ProxyPattern.DynamicProxyPattern;

//原有方法
public class sailPublish implements sail {
    @Override
    public void sailBook() {
        System.out.println("出版社卖书啦!");
    }
}
