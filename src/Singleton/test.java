package Singleton;

public class test {

    public static void main(String[] args) {
        eHanShi EHanShi = eHanShi.getEHanShi();
        eHanShi EHanShi1 = eHanShi.getEHanShi();
        System.out.println(EHanShi==EHanShi1); //true

        lanHanShi Lan=lanHanShi.getLanHanShi();
        lanHanShi Lan1 = lanHanShi.getLanHanShi();
        System.out.println(Lan==Lan1); //true

        shuangChongSuo shung=shuangChongSuo.getShuangChongSuo();
        shuangChongSuo shunag1=shuangChongSuo.getShuangChongSuo();
        System.out.println(shunag1==shung); //true
    }
}
