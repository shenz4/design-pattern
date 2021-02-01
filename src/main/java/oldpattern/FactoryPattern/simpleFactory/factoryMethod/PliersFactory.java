package oldpattern.FactoryPattern.simpleFactory.factoryMethod;

import oldpattern.FactoryPattern.simpleFactory.bean.Pliers;
import oldpattern.FactoryPattern.simpleFactory.bean.Tool;

public class PliersFactory extends ToolFactory {
    @Override
    public Tool createTool() {
        return new Pliers();
    }
}
