package decorator.decorators;

import decorator.abs.AbstractCar;
import decorator.abs.DecoratorCar;

public class FasterCar extends DecoratorCar {

    public FasterCar(AbstractCar decorator) {
        super(decorator);
    }

    public void run() {
        System.out.println("Got a better engine");
        decorator.run();
    }
}
