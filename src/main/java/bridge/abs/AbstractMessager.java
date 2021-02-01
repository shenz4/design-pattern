package bridge.abs;

public abstract class AbstractMessager {

    protected AbstractPlatformApi platformApi;

    public AbstractMessager(AbstractPlatformApi platformApi) {
        this.platformApi = platformApi;
    }

    public abstract void login();

    public abstract void sendMessage();

    public abstract void logout();
}