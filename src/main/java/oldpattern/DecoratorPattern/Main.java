package oldpattern.DecoratorPattern;

import oldpattern.DecoratorPattern.component.Car;
import oldpattern.DecoratorPattern.concrete_component.Benz;
import oldpattern.DecoratorPattern.concrete_decorator.SavingCar;
import oldpattern.DecoratorPattern.concrete_decorator.RoomyCar;
import oldpattern.DecoratorPattern.concrete_decorator.FastCar;

public class Main {

    public static void main(String[] args) {

        // v0，一辆普通的奔驰汽车
        Car benz_v0 = new Benz();
        benz_v0.showOff();
        System.out.println();

        // v1，一辆改装过发动机后的奔驰汽车
        Car benz_v1 = new FastCar(new Benz());
        benz_v1.showOff();
        System.out.println();

        // v2，一辆改装过发动机和动力系统的奔驰汽车
        Car benz_v2 = new SavingCar(new Benz());
        benz_v2.showOff();
        System.out.println();

        // v3，一辆改装过发动机和座位的奔驰汽车
        Car benz_v3 = new FastCar(
                new RoomyCar(
                        new Benz()));
        benz_v3.showOff();
        System.out.println();

        // v4，一辆改装过发动机、动力系统和座位的奔驰汽车
        Car benz_v4 = new RoomyCar(
                new FastCar(
                        new SavingCar(
                                new Benz())));
        benz_v4.showOff();
        System.out.println();
    }
}
