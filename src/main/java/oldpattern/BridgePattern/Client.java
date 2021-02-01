package oldpattern.BridgePattern;

import oldpattern.BridgePattern.concreteModule.AndroidMessagerImp;
import oldpattern.BridgePattern.concreteModule.IOSMessagerImp;
import oldpattern.BridgePattern.concreteModule.MessagerProVersion;
import oldpattern.BridgePattern.concreteModule.MessagerLiteVersion;

public class Client {

    public static void main(String[] args) {
        // 运行 Android Lite版本客户端
        Messager androidLiteMessager = new MessagerLiteVersion(new AndroidMessagerImp());
        androidLiteMessager.login();
        androidLiteMessager.sendMessager();
        androidLiteMessager.sendPicture();

        System.out.println();

        // 运行 Android Pro版本客户端
        Messager androidProMessager = new MessagerProVersion(new AndroidMessagerImp());
        androidProMessager.login();
        androidProMessager.sendMessager();
        androidProMessager.sendPicture();

        System.out.println();

        // 运行 IOS Lite版本客户端
        Messager iosLiteMessager = new MessagerLiteVersion(new IOSMessagerImp());
        iosLiteMessager.login();
        iosLiteMessager.sendMessager();
        iosLiteMessager.sendPicture();

        System.out.println();

        // 运行 IOS Pro版本客户端
        Messager iosProMessager = new MessagerProVersion(new IOSMessagerImp());
        iosProMessager.login();
        iosProMessager.sendMessager();
        iosProMessager.sendPicture();
    }

}
