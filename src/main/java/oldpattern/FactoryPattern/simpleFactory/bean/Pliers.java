package oldpattern.FactoryPattern.simpleFactory.bean;

public class Pliers extends Tool {
    @Override
    public void function() {
        System.out.println("这是一把钳子！");
    }
}
