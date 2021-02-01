package oldpattern.DecoratorPattern.concrete_decorator;

import oldpattern.DecoratorPattern.component.Car;
import oldpattern.DecoratorPattern.decorator.RefitCar;

public class FastCar extends RefitCar {

    public FastCar(Car decorator) {
        super.decorator = decorator;
    }

    @Override
    public void run() {
        decorator.run();
    }

    @Override
    public void showOff() {
        decorator.showOff();
        fast();
    }

    private void fast() {
        System.out.println("And this car is fast.");
    }
}
