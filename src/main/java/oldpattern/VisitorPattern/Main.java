package oldpattern.VisitorPattern;

public class Main {
    public static void main(String[] args) {
        // 观察者
        CTOVisitor tVisitor = new CTOVisitor();
        CEOVisitor eVisitor = new CEOVisitor();

        // 工程师张三
        Engineer zhang = new Engineer("张三", 1000, 20000);

        // 产品经理李四
        Manager li = new Manager("李四", 2000, 5);

        // CTO视角看待二人
        zhang.accept(tVisitor);
        System.out.println();
        li.accept(tVisitor);
        System.out.println();

        // CEO视角看待二人
        zhang.accept(eVisitor);
        System.out.println();
        li.accept(eVisitor);
    }
}
