package factory.simplefactory;

import factory.simplefactory.apple.Apple;
import factory.simplefactory.apple.GreenApple;
import factory.simplefactory.apple.RedApple;

public class SimpleFactory {

    public Apple createApple(String feature){
        if (feature.equals("red")){
            RedApple redApple = new RedApple();
            redApple.wash();
            redApple.peel();
            return redApple;
        }else if (feature.equals("green")){
            GreenApple greenApple = new GreenApple();
            greenApple.wash();
            greenApple.peel();
            return greenApple;
        }
        return null;
    }
}
