package factory.simplefactory.apple;

public abstract class Apple {

    public void wash(){
        System.out.println("Wash apple");
    }

    // 削苹果
    public void peel(){
        System.out.println("Peel Apple");
    }

    public abstract void eat();
}
