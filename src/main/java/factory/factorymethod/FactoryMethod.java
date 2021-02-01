package factory.factorymethod;

import factory.simplefactory.apple.Apple;

public abstract class FactoryMethod {

    protected abstract Apple getApple();

    public Apple createApple(){
        Apple apple = getApple();
        apple.peel();
        apple.wash();
        return apple;
    }
}