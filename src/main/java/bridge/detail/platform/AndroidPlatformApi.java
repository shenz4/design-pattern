package bridge.detail.platform;

import bridge.abs.AbstractPlatformApi;

public class AndroidPlatformApi extends AbstractPlatformApi {
    @Override
    public void platformLogin() {
        System.out.println("Invoke Android login api");
    }

    @Override
    public void platformSendMessage() {
        System.out.println("Invoke Android send message api");
    }

    @Override
    public void platformLogout() {
        System.out.println("Invoke Android logout api");
    }
}
