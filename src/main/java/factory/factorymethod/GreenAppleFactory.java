package factory.factorymethod;

import factory.simplefactory.apple.Apple;
import factory.simplefactory.apple.GreenApple;

public class GreenAppleFactory extends FactoryMethod{

    protected Apple getApple() {
        return new GreenApple();
    }
}
