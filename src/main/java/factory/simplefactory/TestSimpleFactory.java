package factory.simplefactory;

import factory.simplefactory.apple.Apple;

public class TestSimpleFactory {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Apple red = factory.createApple("red");
        red.eat();
        System.out.println();

        Apple green = factory.createApple("green");
        green.eat();
    }
}
