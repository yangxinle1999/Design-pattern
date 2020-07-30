package AbstractFactory;

public class northFruitFactory implements fruitFactory {
    @Override
    public fruit getApple() {
        return new northApple();
    }

    @Override
    public fruit getPera() {
        return new northPear();
    }
}
