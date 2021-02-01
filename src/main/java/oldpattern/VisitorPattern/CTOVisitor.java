package oldpattern.VisitorPattern;

public class CTOVisitor implements Visitor {
    @Override
    public void visitEngineer(Engineer e) {
        System.out.println("CTO眼中的工程师信息：");
        System.out.println("姓名：" + e.getName());
        System.out.println("代码量：" + e.getCodeLines());
    }

    @Override
    public void visitManager(Manager m) {
        System.out.println("CTO眼中的产品经理信息：");
        System.out.println("姓名：" + m.getName());
        System.out.println("新产品数量：" + m.getProducts());
    }
}
