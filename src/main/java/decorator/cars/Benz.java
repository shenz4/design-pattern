package decorator.cars;

import decorator.abs.AbstractCar;

public class Benz extends AbstractCar {
    @Override
    public void run() {
        System.out.println("Benz car run ...");
        System.out.println();
    }
}
