package bridge.detail.platform;

import bridge.abs.AbstractPlatformApi;

public class IosPlatformApi extends AbstractPlatformApi {
    @Override
    public void platformLogin() {
        System.out.println("Invoke IOS login api");
    }

    @Override
    public void platformSendMessage() {
        System.out.println("Invoke IOS send message api");
    }

    @Override
    public void platformLogout() {
        System.out.println("Invoke IOS logout api");
    }
}