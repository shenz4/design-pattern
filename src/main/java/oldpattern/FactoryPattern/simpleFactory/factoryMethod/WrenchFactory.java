package oldpattern.FactoryPattern.simpleFactory.factoryMethod;

import oldpattern.FactoryPattern.simpleFactory.bean.Tool;
import oldpattern.FactoryPattern.simpleFactory.bean.Wrench;

public class WrenchFactory extends ToolFactory {
    @Override
    public Tool createTool() {
        return new Wrench();
    }
}
