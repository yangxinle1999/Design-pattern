package DecoratorPattern;

public class test {

    public static void main(String[] args) {
        Car car=new runCar();
        car.show(); //我可以跑！
        System.out.println("------------");

        carDecorator carDecorator=new flyCarDecorator(car);
        carDecorator.show(); //我可以跑！我可以飞！
        System.out.println("-----------------");

        carDecorator carDecorator1=new swimCarDecorator(carDecorator);
        carDecorator1.show(); //我可以跑！我可以飞！我可以游！
    }
}
