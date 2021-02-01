package factory.abstractfactory.pear;

import factory.abstractfactory.Red;
import factory.simplefactory.apple.Apple;

public class RedPear extends Pear implements Red {

    @Override
    public void eat(){
        System.out.println("Eat a red pear");
    }
}
