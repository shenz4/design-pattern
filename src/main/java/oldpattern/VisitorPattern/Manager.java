package oldpattern.VisitorPattern;

public class Manager extends Staff {

    private int products;

    public Manager(String name, int kpi, int products) {
        super(name, kpi);
        this.products = products;
    }

    public int getProducts() {
        return products;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitManager(this);
    }
}
