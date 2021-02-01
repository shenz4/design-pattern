package oldpattern.DecoratorPattern.concrete_decorator;

import oldpattern.DecoratorPattern.component.Car;
import oldpattern.DecoratorPattern.decorator.RefitCar;

public class RoomyCar extends RefitCar {

    public RoomyCar(Car decotator) {
        super.decorator = decotator;
    }

    @Override
    public void run() {
        decorator.run();
    }

    @Override
    public void showOff() {
        decorator.showOff();
        roomy();
    }

    private void roomy() {
        System.out.println("And this car is roomy.");
    }
}
