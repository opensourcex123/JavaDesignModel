package testFour.two;

// 即是适配器模式的目标类，也是代理模式的实际主题
public class Actor extends Work {
    @Override
    public void work() {
        System.out.println("演员实际联络工作...");
    }
}
