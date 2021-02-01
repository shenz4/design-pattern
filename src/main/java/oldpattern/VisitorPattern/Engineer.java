package oldpattern.VisitorPattern;

public class Engineer extends Staff {
    private int codeLines;

    public Engineer(String name, int kpi, int codeLines) {
        super(name, kpi);
        this.codeLines = codeLines;
    }

    public int getCodeLines() {
        return codeLines;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitEngineer(this);
    }
}
