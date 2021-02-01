package oldpattern.FactoryPattern.simpleFactory.factoryMethod;

import oldpattern.FactoryPattern.simpleFactory.bean.Tool;

public abstract class ToolFactory {

    /**
     * 这是一个模板方法，以此实现统一的接口来创建对象
     */
    public Tool factoryMethod() {

        // TODO 可以在模板方法中做一些其它的事
        Tool tool;
        tool = createTool();
        if (tool == null) {
            throw new RuntimeException("创建对象失败，可能是因为具体工厂未正确覆盖createTool()方法");
        }
        // TODO 可以在模板方法中做一些其它的事
        return tool;
    }

    public abstract Tool createTool();
}
