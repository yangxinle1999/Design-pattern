package FactoryMethod;


public class pearFactory implements fruitFactory {
    @Override
    public Fruit getFruit() {
        return new pear();
    }
}
