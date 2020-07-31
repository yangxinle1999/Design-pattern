package DecoratorPattern;

//飞
public class flyCarDecorator extends carDecorator {

    public flyCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        this.getCar().show();
        this.fly();
    }

    @Override
    public void run() {

    }

    public void fly(){
        System.out.println("我可以飞！");
    }
}
