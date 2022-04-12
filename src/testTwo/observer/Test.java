package testTwo.observer;

public class Test {
    public static void main(String[] args) {
        // 创建主题
        Subject stock = new Stock();
        // 创建观察者
        Observer stockHolder = new StockHolder();

        // 将观察者加入主题，推送通知
        stock.addObserver(stockHolder);
        stock.notifyObserver("股票价格变动超过5%， 现在价格为3");
    }
}
