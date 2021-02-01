package oldpattern.FactoryPattern.simpleFactory;

import oldpattern.FactoryPattern.simpleFactory.bean.Tool;

public class Test {

    public static void main(String[] args) throws RuntimeException {
        ToolFactory factory = new ToolFactory();

        // 创建一个钳子实例
        Tool pliers = factory.create("pliers");
        pliers.function();

        // 创建一个扳手实例
        Tool wrench = factory.create("wrench");
        wrench.function();
    }
}
