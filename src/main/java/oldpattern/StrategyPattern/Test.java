package oldpattern.StrategyPattern;

public class Test {

    public static void main(String[] args) {
        // 表示当前所在区域
        String area = "";
        try {
            area = args[0];
        } catch (Exception e) {
            System.out.println("GPS定位失败！");
        }

        GameStrategy gameStrategy;
        switch (area) {
            case "Amercia":
                gameStrategy = new GameStrategyAmercia();
                break;
            case "China":
                gameStrategy = new GameStrategyChina();
                break;
            case "France":
                gameStrategy = new GameStrategyFrance();
                break;
            default:
                System.out.println("模块加载失败");
                return;
        }

        // 装载模块
        gameStrategy.loadModule();
        // 开始游戏
        System.out.println("游戏开始！");
    }
}
