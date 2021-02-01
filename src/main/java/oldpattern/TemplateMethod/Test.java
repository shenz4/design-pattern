package oldpattern.TemplateMethod;

public class Test {
    public static void main(String[] args) {

        Machine machine = null;

        // 现在需要生产蓝色桌椅
        machine = new BlueMachine();
        machine.templateMethod();

        System.out.println();
        System.out.println();

        // 现在需要生产红色桌椅
        machine = new RedMachine();
        machine.templateMethod();

    }
}
