package oldpattern.StrategyPattern;

// 中国策略
public class GameStrategyChina implements GameStrategy {
    @Override
    public void loadModule() {
        System.out.println("装载中国模块");
    }
}
