package oldpattern.VisitorPattern;

public class CEOVisitor implements Visitor {
    @Override
    public void visitEngineer(Engineer e) {
        System.out.println("CEO眼中的工程师信息：");
        System.out.println("姓名：" + e.getName());
        System.out.println("KPI：" + e.getKpi());
        System.out.println("代码量：" + e.getCodeLines());
    }

    @Override
    public void visitManager(Manager m) {
        System.out.println("CEO眼中的产品经理信息：");
        System.out.println("姓名：" + m.getName());
        System.out.println("KPI：" + m.getKpi());
        System.out.println("新产品数量：" + m.getProducts());
    }
}
