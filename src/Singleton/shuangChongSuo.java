package Singleton;

public class shuangChongSuo {

    private static shuangChongSuo shuang=null;

    private shuangChongSuo(){

    }

    //双重所来保证多线程安全
    public static shuangChongSuo getShuangChongSuo(){
        if (shuang==null) {
            synchronized (shuangChongSuo.class){
                if (shuang==null){
                    shuang=new shuangChongSuo();
                }
            }
        }
        return shuang;
    }


}
