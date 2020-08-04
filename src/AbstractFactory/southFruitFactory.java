package AbstractFactory;

public class southFruitFactory implements fruitFactory {
    @Override
    public fruit getApple() {
        return new southApple();
    }


    @Override
    public fruit getPera() {
        return new southPear();
    }
}
