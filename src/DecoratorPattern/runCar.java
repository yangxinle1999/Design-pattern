package DecoratorPattern;

//实现每种车都有的功能
public class runCar implements Car {
    @Override
    public void show() {
        this.run();
    }

    @Override
    public void run() {
        System.out.println("我可以跑！");
    }
}
