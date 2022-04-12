package testTwo.observer;

// 抽象主题接口
public interface Subject {
    public void addObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObserver(String str);
}
