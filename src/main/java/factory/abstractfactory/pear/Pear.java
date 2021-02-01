package factory.abstractfactory.pear;

public abstract class Pear {

    public void wash(){
        System.out.println("Wash pear");
    }

    // 削梨
    public void peel(){
        System.out.println("Peel pear");
    }

    public abstract void eat();
}
