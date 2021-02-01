package oldpattern.FactoryPattern.simpleFactory;

import oldpattern.FactoryPattern.simpleFactory.bean.Pliers;
import oldpattern.FactoryPattern.simpleFactory.bean.Tool;
import oldpattern.FactoryPattern.simpleFactory.bean.Wrench;

class ToolFactory {

    Tool create(String name) throws RuntimeException {

        Tool component = null;
        if (name.equals("pliers")) {
            component = new Pliers();
        } else if (name.equals("wrench")) {
            component = new Wrench();
        }

        // 返回component对象
        if (component == null) {
            throw new RuntimeException("Create Instance failed Exception");
        } else {
            return component;
        }
    }
}
