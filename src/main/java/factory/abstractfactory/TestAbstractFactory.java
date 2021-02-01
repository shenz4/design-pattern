package factory.abstractfactory;

import factory.abstractfactory.pear.GreenPear;
import factory.abstractfactory.pear.RedPear;
import factory.simplefactory.apple.GreenApple;
import factory.simplefactory.apple.RedApple;

public class TestAbstractFactory {

    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        RedApple redApple = (RedApple) appleFactory.createRedFruit();
        redApple.eat();
        GreenApple greenApple = (GreenApple) appleFactory.createGreenFruit();
        greenApple.eat();

        PearFactory pearFactory = new PearFactory();
        RedPear redPear = (RedPear) pearFactory.createRedFruit();
        redPear.eat();
        GreenPear greenPear = (GreenPear) pearFactory.createGreenFruit();
        greenPear.eat();
    }
}
