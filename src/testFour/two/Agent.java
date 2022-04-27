package testFour.two;

// 代理模式的代理类
public class Agent extends Work {
    private Actor actor = new Actor();
    @Override
    public void work() {
        System.out.println("经纪人代理联络工作...");
        actor.work();
    }
}
