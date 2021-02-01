package oldpattern.ObserverPattern;

public class GirlStudent implements Observer {

    private String name;

    public GirlStudent(String name) {
        this.name = name;
    }

    @Override
    public void takeNote() {
        System.out.println(name + "在工整地记笔记！");
    }

    @Override
    public void reciteArticle() {
        System.out.println(name + "在小声背诵课文！");
    }

    @Override
    public void answerQuestion() {
        System.out.println(name + "在害羞地回答问题！");
    }
}
