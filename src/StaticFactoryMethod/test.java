package StaticFactoryMethod;

public class test {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        fruitFactory.getFruit("apple").eat();
        fruitFactory.getFruit("banana").eat();
        fruitFactory.getFruit2("apple").eat();
        fruitFactory.getFruit2("banana").eat();
        System.out.println("成功！");
    }
}