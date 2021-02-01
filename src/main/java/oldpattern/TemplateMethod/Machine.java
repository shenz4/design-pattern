package oldpattern.TemplateMethod;

public abstract class Machine {

    abstract void coloring();

    public final void templateMethod() {
        // 1.获取木材
        getWood();
        // 2.组装部件
        assemble();
        // 3.涂色(等待子类实现)
        coloring();
        // 4.风干出厂
        airDrying();
    }

    protected final void getWood() {
        System.out.println("在深山老林里找到了木材！");
    }

    protected final void assemble() {
        System.out.println("三下五除二把桌椅组装好了！");
    }

    protected final void airDrying() {
        System.out.println("放在室外等油漆干掉！");
    }

}
