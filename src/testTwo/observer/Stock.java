package testTwo.observer;

import java.util.ArrayList;
import java.util.List;

// 实现抽象主题的具体主题：股票
public class Stock implements Subject {

    // 存放观察者
    private List<Observer> list = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObserver(String str) {
        for (Observer o :
                list) {
            o.update(str);
        }
    }
}
