package TemplatePattern;

public class test {

    public static void main(String[] args) {
        MakeCar makeCar=new MakeBus();
        makeCar.make();
        System.out.println("----------");
        MakeCar makeCar1=new MakeJeep();
        makeCar1.make();
    }
}
