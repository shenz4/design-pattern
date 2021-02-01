package factory.factorymethod;

import factory.simplefactory.apple.Apple;

public class TestFactoryMethod {
    public static void main(String[] args) {
        RedAppleFactory redFactory = new RedAppleFactory();
        Apple red = redFactory.createApple();
        red.eat();
        System.out.println();

        GreenAppleFactory greenFactory = new GreenAppleFactory();
        Apple green = greenFactory.createApple();
        green.eat();
    }
}
