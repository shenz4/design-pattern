package oldpattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private List<Observer> subscribers;


    public void letStudentTakeNote() {
        System.out.println("老师通知同学们记笔记！");
        notifyToTakeNote();
    }


    public void letStudentReciteArticle() {
        System.out.println("老师让同学们背课文！");
        notifyToRecite();
    }


    public void letStudentAnswerQuestion() {
        System.out.println("老师提问某个同学!");
        notifyToAnswerQuestion();
    }

    // 添加订阅者
    public void addSubscriber(Observer student) {
        if (subscribers == null) {
            subscribers = new ArrayList<Observer>();
        }

        subscribers.add(student);
    }

    // 移除订阅者
    public void removeSubscriber(Observer student) {
        if (subscribers != null) {
            int i = subscribers.indexOf(student);

            if (i >= 0) {
                subscribers.remove(i);
            }
        }
    }

    // 通知列表中的订阅者记笔记
    public void notifyToTakeNote() {
        for (Observer student : subscribers) {
            student.takeNote();
        }
    }

    // 通知列表中的订阅者背课文
    public void notifyToRecite() {
        for (Observer student : subscribers) {
            student.reciteArticle();
        }
    }


    // 通知列表中的订阅者回答问题
    public void notifyToAnswerQuestion() {
        for (Observer student : subscribers) {
            student.answerQuestion();
        }
    }
}