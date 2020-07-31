package DecoratorPattern;

//装饰的父类
public abstract class carDecorator implements Car {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public carDecorator(Car car) {
        this.car=car;
    }

    public abstract void show();
}
