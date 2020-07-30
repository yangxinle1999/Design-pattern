package FactoryMethod;

public class appleFactory implements fruitFactory {
    @Override
    public Fruit getFruit() {
        return new apple();
    }
}
