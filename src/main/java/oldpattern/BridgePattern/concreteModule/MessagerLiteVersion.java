package oldpattern.BridgePattern.concreteModule;

import oldpattern.BridgePattern.Messager;
import oldpattern.BridgePattern.MessagerImp;

public class MessagerLiteVersion extends Messager {

    public MessagerLiteVersion(MessagerImp messagerImp) {
        super(messagerImp);
    }

    @Override
    public void login() {
        System.out.println("开始登录！");
    }

    @Override
    public void sendMessager() {
        System.out.println("发送消息！");
    }

    @Override
    public void sendPicture() {
        System.out.println("发送图片！");
    }
}
