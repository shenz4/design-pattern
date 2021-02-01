package oldpattern.PrototypePattern;

public class Test {

    public static void main(String[] args) {

        // 小组leader的状态
        Programmer leader = new Programmer();
        leader.name = "leader";
        leader.language = "Java";
        leader.framework = "SSM";
        leader.isRefuseWorkOvertime = false;

        // 小组成员member1的状态
        Programmer member1 = leader.clone();
        member1.name = "member1";
        member1.hobby = "下棋";
        member1.isGetUpEarly = false;
        member1.ishasLover = true;

        // 组员member2的状态
        Programmer member2 = leader.clone();
        member2.name = "member2";
        member2.hobby = "打球";
        member2.isGetUpEarly = false;
        member2.ishasLover = false;

        // 组员member3的状态
        Programmer member3 = leader.clone();
        member3.name = "member3";
        member3.hobby = "打游戏";
        member3.isGetUpEarly = true;
        member3.ishasLover = true;

        // 输出leader和三位member的概况
        leader.outputInfo();
        member1.outputInfo();
        member2.outputInfo();
        member3.outputInfo();
    }
}
