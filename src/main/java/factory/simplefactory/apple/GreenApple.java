package factory.simplefactory.apple;

import factory.abstractfactory.Green;

public class GreenApple extends Apple implements Green {

    @Override
    public void eat(){
        System.out.println("Eat a green apple");
    }
}
