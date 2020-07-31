package Singleton;

//单例模式
public class eHanShi {

    private final static eHanShi sing=new eHanShi();

    private eHanShi(){

    }

    public static eHanShi getEHanShi(){
        return sing;
    }

}
