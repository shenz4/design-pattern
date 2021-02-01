package oldpattern.BridgePattern.concreteModule;

import oldpattern.BridgePattern.MessagerImp;

public class AndroidMessagerImp extends MessagerImp {
    @Override
    public void playSound() {
        System.out.println("在Android上后台播放音乐！");
    }

    @Override
    public void playAnimation() {
        System.out.println("在Android上播放动画！");
    }
}
