package oldpattern.PrototypePattern;

public class Programmer implements Cloneable {

    // ----------以下是每位程序员同志在工作上的技能与态度--------//

    // 最擅长使用的编程语言
    public String language;
    // 最擅长使用的框架
    public String framework;
    // 是否拒绝加班
    public Boolean isRefuseWorkOvertime;


    // ----------以下是每位程序员同志在生活上的爱好与现状--------//

    // 姓名
    public String name;
    // 平时有什么兴趣爱好
    public String hobby;
    // 是否早起
    public Boolean isGetUpEarly;
    // 是否有女朋友
    public Boolean ishasLover;


    public Programmer clone() {
        Programmer cloned = null;
        try {
            cloned = (Programmer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }

    public void outputInfo() {
        if (name != null) {
            System.out.println(name + ":");
        }
        if (language != null) {
            System.out.println("最擅长的语言是" + language);
        }
        if (framework != null) {
            System.out.println("最擅长的框架是" + framework);
        }
        if (isRefuseWorkOvertime != null) {
            String t = isRefuseWorkOvertime ? "拒绝" : "不拒绝";
            System.out.println(t + "加班");
        }
        System.out.println();
        if (hobby != null) {
            System.out.println("喜欢" + hobby);
        }
        if (isGetUpEarly != null) {
            String t = isRefuseWorkOvertime ? "可以" : "不可以";
            System.out.println(t + "坚持早起");
        }

        if (ishasLover != null) {
            String t = ishasLover ? "有" : "没有";
            System.out.println(t + "女朋友");
        }
        System.out.println("----");
    }
}
