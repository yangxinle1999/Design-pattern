package TemplatePattern;

//只是内部实现不同
public class MakeJeep extends MakeCar {
    @Override
    public void makeHead() {
        System.out.println("jeep:车头");
    }

    @Override
    public void makeBody() {
        System.out.println("jeep:车身");
    }

    @Override
    public void makeTail() {
        System.out.println("jeep:车尾");
    }
}
