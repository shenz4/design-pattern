package factory.abstractfactory.pear;

import factory.abstractfactory.Green;
import factory.simplefactory.apple.Apple;

public class GreenPear extends Pear implements Green {

    @Override
    public void eat(){
        System.out.println("Eat a green pear");
    }
}
