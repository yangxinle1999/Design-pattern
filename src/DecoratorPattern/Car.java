package DecoratorPattern;

//接口，定义Car共有的行为
public interface Car {
    void show();  //每种车都可以展示
    void run(); //每种车都可以跑
}
