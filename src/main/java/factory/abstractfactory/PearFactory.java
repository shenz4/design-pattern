package factory.abstractfactory;

import factory.abstractfactory.pear.GreenPear;
import factory.abstractfactory.pear.Pear;
import factory.abstractfactory.pear.RedPear;

public class PearFactory extends AbstractFactory {

    public Red createRedFruit() {
        return new RedPear();
    }

    public Green createGreenFruit() {
        return new GreenPear();
    }
}
