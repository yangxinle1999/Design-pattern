package Singleton;

public class lanHanShi {

    private static lanHanShi lan=null;

    private lanHanShi(){

    }

    //多线程不安全
    public static lanHanShi getLanHanShi(){
        if (lan==null){
            lan=new lanHanShi();
        }
        return lan;
    }
}
