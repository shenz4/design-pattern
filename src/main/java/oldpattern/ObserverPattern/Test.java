package oldpattern.ObserverPattern;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        // 男同学，名字是小明
        BoyStudent xiaoMing = new BoyStudent("xiaoMing");
        // 女同学，名字是小花
        GirlStudent xiaoHua = new GirlStudent("xiaoHua");

        // 通知两个人记笔记
        teacher.addSubscriber(xiaoMing);
        teacher.addSubscriber(xiaoHua);
        teacher.letStudentTakeNote();

        System.out.println();

        // 通知两个人背课文
        teacher.letStudentReciteArticle();

        System.out.println();

        // 仅提问小明
        teacher.removeSubscriber(xiaoHua);
        teacher.letStudentAnswerQuestion();

        System.out.println();

        // 仅提问小花
        teacher.removeSubscriber(xiaoMing);
        teacher.addSubscriber(xiaoHua);
        teacher.letStudentAnswerQuestion();
    }
}
