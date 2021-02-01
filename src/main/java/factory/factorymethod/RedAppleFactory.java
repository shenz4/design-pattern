package factory.factorymethod;

import factory.simplefactory.apple.Apple;
import factory.simplefactory.apple.RedApple;

public class RedAppleFactory extends FactoryMethod{

    protected Apple getApple() {
        return new RedApple();
    }
}
