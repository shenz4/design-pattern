package factory.abstractfactory;

import factory.simplefactory.apple.Apple;
import factory.simplefactory.apple.GreenApple;
import factory.simplefactory.apple.RedApple;

public class AppleFactory extends AbstractFactory {

    public Red createRedFruit() {
        return new RedApple();
    }

    public Green createGreenFruit() {
        return new GreenApple();
    }
}
