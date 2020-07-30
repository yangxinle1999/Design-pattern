package AbstractFactory;

public class test {

    public static void main(String[] args) {
        fruitFactory fruitFactory=new northFruitFactory();
        fruitFactory.getApple().eat();
        fruitFactory.getPera().eat();

        fruitFactory fruitFactory1=new southFruitFactory();
        fruitFactory1.getPera().eat();
        fruitFactory1.getApple().eat();
    }
}
