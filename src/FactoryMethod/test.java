package FactoryMethod;

public class test {
    public static void main(String[] args) {
        fruitFactory fruitFactory=new appleFactory();
        apple fruit = (apple) fruitFactory.getFruit();
        fruit.eat(); //吃苹果
        fruitFactory pearFactory=new pearFactory();
        pear p = (pear) pearFactory.getFruit();
        p.eat(); //吃梨子
        System.out.println("成功！");
    }
}
