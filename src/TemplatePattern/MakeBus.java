package TemplatePattern;

//只是内部实现不同
public class MakeBus extends MakeCar {
    @Override
    public void makeHead() {
        System.out.println("car:车头");
    }

    @Override
    public void makeBody() {
        System.out.println("car:车身");
    }

    @Override
    public void makeTail() {
        System.out.println("car:车尾");
    }
}
