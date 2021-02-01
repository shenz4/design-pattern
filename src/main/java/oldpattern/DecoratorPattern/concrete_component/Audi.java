package oldpattern.DecoratorPattern.concrete_component;

import oldpattern.DecoratorPattern.component.Car;

public class Audi extends Car {

    @Override
    public void run() {
        System.out.println("There is a car running.");
    }

    @Override
    public void showOff() {
        run();
        System.out.println("Its brand is Audi.");
    }
}
