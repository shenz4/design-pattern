package bridge.detail.messager;

import bridge.abs.AbstractMessager;
import bridge.abs.AbstractPlatformApi;

public class LiteMessager extends AbstractMessager {
    public LiteMessager(AbstractPlatformApi platformApi) {
        super(platformApi);
    }

    @Override
    public void login() {
        System.out.println("Lite login begin ...");
        platformApi.platformLogin();
        System.out.println("Lite login end ...");
    }

    @Override
    public void sendMessage() {
        System.out.println("Lite send message begin ...");
        platformApi.platformSendMessage();
        System.out.println("Lite send message end ...");
    }

    @Override
    public void logout() {
        System.out.println("Lite logout begin ...");
        platformApi.platformLogout();
        System.out.println("Lite logout end ...");
    }
}
