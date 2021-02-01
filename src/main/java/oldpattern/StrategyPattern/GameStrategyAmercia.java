package oldpattern.StrategyPattern;

// 美国策略
public class GameStrategyAmercia implements GameStrategy {
    @Override
    public void loadModule() {
        System.out.println("装载美国模块");
    }
}
