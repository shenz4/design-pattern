package oldpattern.FactoryPattern.simpleFactory.bean;

public class Wrench extends Tool {
    @Override
    public void function() {
        System.out.println("这是一把扳手！");
    }
}
