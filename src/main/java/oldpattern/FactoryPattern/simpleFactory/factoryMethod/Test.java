package oldpattern.FactoryPattern.simpleFactory.factoryMethod;

import oldpattern.FactoryPattern.simpleFactory.bean.Tool;

public class Test {

    public static void main(String[] args) throws RuntimeException {

        // 创建一个钳子实例
        PliersFactory factory0 = new PliersFactory();
        Tool pliers = factory0.factoryMethod();
        pliers.function();

        // 创建一个扳手实例
        WrenchFactory factory1 = new WrenchFactory();
        Tool wrench = factory1.factoryMethod();
        wrench.function();
    }
}
