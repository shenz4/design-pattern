package bridge;

import bridge.detail.messager.LiteMessager;
import bridge.detail.messager.ProMessager;
import bridge.detail.platform.AndroidPlatformApi;
import bridge.detail.platform.IosPlatformApi;

public class TestBridge {
    public static void main(String[] args) {

        // Android 上的 Lite 版本
        LiteMessager liteOnAndroid = new LiteMessager(new AndroidPlatformApi());
        liteOnAndroid.login();
        System.out.println();

        // IOS 上的 Lite 版本
        LiteMessager liteOnIos = new LiteMessager(new IosPlatformApi());
        liteOnIos.sendMessage();
        System.out.println();

        // Android 上的 Pro 版本
        ProMessager proOnAndroid = new ProMessager(new AndroidPlatformApi());
        proOnAndroid.sendMessage();
        System.out.println();

        // IOS 上的 Pro 版本
        ProMessager proOnIos = new ProMessager(new IosPlatformApi());
        proOnIos.logout();
        System.out.println();
    }
}
