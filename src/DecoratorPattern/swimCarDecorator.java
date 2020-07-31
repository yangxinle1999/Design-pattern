package DecoratorPattern;

//游
public class swimCarDecorator extends carDecorator {
    public swimCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        this.getCar().show();
        this.swim();
    }

    @Override
    public void run() {

    }

    public void swim(){
        System.out.println("我可以游！");
    }
}
