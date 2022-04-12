package testTwo.observer;

// 具体观察者：股民 实现了抽象观察者接口
public class StockHolder implements Observer{

    @Override
    public void update(String str) {
        System.out.println("我是购买了该股票的股民");
        System.out.println("我收到了通知:" + str);
    }
}
