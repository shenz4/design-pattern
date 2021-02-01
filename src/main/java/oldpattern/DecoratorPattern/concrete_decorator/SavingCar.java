package oldpattern.DecoratorPattern.concrete_decorator;

import oldpattern.DecoratorPattern.component.Car;
import oldpattern.DecoratorPattern.decorator.RefitCar;

public class SavingCar extends RefitCar {

    public SavingCar(Car decorator) {
        super.decorator = decorator;
    }

    @Override
    public void run() {
        decorator.run();
    }

    @Override
    public void showOff() {
        decorator.showOff();
        saving();
    }

    private void saving() {
        System.out.println("And this car is fuel-saving.");
    }
}
