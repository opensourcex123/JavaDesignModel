package testFour.two;

// 适配器模式的适配器
public class Adapter extends Actor {
    private Replacement adaptee;

    public Adapter(Replacement adaptee) {
        super();
        this.adaptee = adaptee;
    }

    public void work() {
        this.adaptee.show();
    }
}
