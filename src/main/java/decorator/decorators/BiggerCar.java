package decorator.decorators;

import decorator.abs.AbstractCar;
import decorator.abs.DecoratorCar;

public class BiggerCar extends DecoratorCar {

    public BiggerCar(AbstractCar decorator) {
        super(decorator);
    }

    public void run() {
        System.out.println("Got more space");
        decorator.run();
    }
}
