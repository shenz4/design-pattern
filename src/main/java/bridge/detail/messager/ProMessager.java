package bridge.detail.messager;

import bridge.abs.AbstractMessager;
import bridge.abs.AbstractPlatformApi;

public class ProMessager extends AbstractMessager {
    public ProMessager(AbstractPlatformApi platformApi) {
        super(platformApi);
    }

    @Override
    public void login() {
        System.out.println("Pro login begin ...");
        platformApi.platformLogin();
        System.out.println("Pro login end ...");
    }

    @Override
    public void sendMessage() {
        System.out.println("Pro send message begin ...");
        platformApi.platformSendMessage();
        System.out.println("Pro send message end ...");
    }

    @Override
    public void logout() {
        System.out.println("Pro logout begin ...");
        platformApi.platformLogout();
        System.out.println("Pro logout end ...");
    }
}
