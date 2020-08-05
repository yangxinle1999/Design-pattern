package AbstractFactory;

public class test {

    public static void main(String[] args) {
        fruitFactory fruitFactory=new northFruitFactory();
        fruitFactory.getApple().eat(); //北方苹果！
        fruitFactory.getPera().eat(); //北方梨子！


        fruitFactory fruitFactory1=new southFruitFactory();
        fruitFactory1.getPera().eat(); //南方梨子！
        fruitFactory1.getApple().eat(); //南方苹果！
        System.out.println("成功！");
    }
}
