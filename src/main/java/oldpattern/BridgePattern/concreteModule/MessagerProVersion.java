package oldpattern.BridgePattern.concreteModule;

import oldpattern.BridgePattern.Messager;
import oldpattern.BridgePattern.MessagerImp;

public class MessagerProVersion extends Messager {

    public MessagerProVersion(MessagerImp messagerImp) {
        super(messagerImp);
    }

    @Override
    public void login() {
        getImp().playSound();
        System.out.println("开始登录！");
    }

    @Override
    public void sendMessager() {
        getImp().playAnimation();
        System.out.println("发送消息！");
    }

    @Override
    public void sendPicture() {
        getImp().playAnimation();
        System.out.println("发送图片！");
    }
}
