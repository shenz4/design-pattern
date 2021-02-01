package factory.simplefactory.apple;

import factory.abstractfactory.Red;
import factory.simplefactory.apple.Apple;

public class RedApple extends Apple implements Red {

    @Override
    public void eat(){
        System.out.println("Eat a red apple");
    }
}
