package ProxyPattern.DynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//动态代理类
public class myHandler implements InvocationHandler {

    private Object object;
    public myHandler(Object o){
        this.object=o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        daZhe();
        method.invoke(this.object, args); //执行拦截的目标方法
        youHuiQuan();
        return null;
    }

    public void daZhe(){
        System.out.println("打八折！");
    }
    public void youHuiQuan(){
        System.out.println("优惠券！");
    }
}
