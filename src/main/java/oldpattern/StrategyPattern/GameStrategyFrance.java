package oldpattern.StrategyPattern;

// 法国策略
public class GameStrategyFrance implements GameStrategy {
    @Override
    public void loadModule() {
        System.out.println("装载法国模块");
    }
}
