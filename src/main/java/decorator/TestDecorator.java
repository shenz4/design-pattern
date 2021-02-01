package decorator;

import decorator.cars.Benz;
import decorator.decorators.BiggerCar;
import decorator.decorators.FasterCar;

public class TestDecorator {
    public static void main(String[] args) {

        Benz benz = new Benz();
        benz.run();

        FasterCar fasterBenz = new FasterCar(benz);
        fasterBenz.run();

        BiggerCar biggerFasterBenz = new BiggerCar(fasterBenz);
        biggerFasterBenz.run();
    }
}
