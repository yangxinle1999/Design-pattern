package TemplatePattern;

public class test {

    public static void main(String[] args) {
        MakeCar makeCar=new MakeBus();
        makeCar.make();
//        car:车头
//        car:车身
//        car:车尾
        System.out.println("----------");
        MakeCar makeCar1=new MakeJeep();
        makeCar1.make();
//        jeep:车头
//        jeep:车身
//        jeep:车尾
    }
}
