package oldpattern.BridgePattern.concreteModule;

import oldpattern.BridgePattern.MessagerImp;

public class IOSMessagerImp extends MessagerImp {
    @Override
    public void playSound() {
        System.out.println("在IOS上后台播放音乐！");
    }

    @Override
    public void playAnimation() {
        System.out.println("在IOS上播放动画！");
    }
}
