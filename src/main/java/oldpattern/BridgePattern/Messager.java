package oldpattern.BridgePattern;

public abstract class Messager {

    private MessagerImp imp;

    public Messager(MessagerImp messager) {
        imp = messager;
    }

    public abstract void login();

    public abstract void sendMessager();

    public abstract void sendPicture();

    protected MessagerImp getImp() {
        return imp;
    }

}
