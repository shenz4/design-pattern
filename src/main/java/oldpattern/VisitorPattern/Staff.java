package oldpattern.VisitorPattern;

public abstract class Staff {
    private String name;
    private int kpi;

    public abstract void accept(Visitor visitor);

    public Staff(String name, int kpi) {
        this.name = name;
        this.kpi = kpi;
    }

    public String getName() {
        return name;
    }

    public int getKpi() {
        return kpi;
    }
}
