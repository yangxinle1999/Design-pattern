package FactoryMethod;

public class test {
    public static void main(String[] args) {
        fruitFactory fruitFactory=new appleFactory();
        apple fruit = (apple) fruitFactory.getFruit();
        fruit.eat();
        fruitFactory pearFactory=new pearFactory();
        pear p = (pear) pearFactory.getFruit();
        p.eat();
    }
}
