package ProxyPattern.staticProxyPattern;

//代理类
public class sailPublishProxy {

    private sailPublish sailPublish;

    public void sailBook(){
        if (sailPublish==null){
            sailPublish=new sailPublish();
        }
        daZhe();
        sailPublish.sailBook(); //对原有方法进行加强（静态代理）
        youHuiQuan();
    }

    public void daZhe(){
        System.out.println("打八折！");
    }
    public void youHuiQuan(){
        System.out.println("优惠券！");
    }
}
