package oldpattern.ObserverPattern;

public class BoyStudent implements Observer {
    private String name;

    public BoyStudent(String name) {
        this.name = name;
    }

    @Override
    public void takeNote() {
        System.out.println(name + "在潦草地记笔记！");
    }

    @Override
    public void reciteArticle() {
        System.out.println(name + "在大声背诵课文！");
    }

    @Override
    public void answerQuestion() {
        System.out.println(name + "在勇敢地回答问题！");
    }
}
