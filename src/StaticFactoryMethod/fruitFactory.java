package StaticFactoryMethod;

public class fruitFactory {

    public static fruit getFruit(String fruitName) throws IllegalAccessException, InstantiationException {
        if (fruitName.equalsIgnoreCase("apple")){
            return apple.class.newInstance();
        }else if (fruitName.equalsIgnoreCase("banana")){
            return banana.class.newInstance();
        }else {
            System.out.println("输入的水果名有误");
            return null;
        }
    }

    public static fruit getFruit2(String fruitName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class aClass = Class.forName("StaticFactoryMethod." + fruitName);
        return (fruit) aClass.newInstance();
    }
}
