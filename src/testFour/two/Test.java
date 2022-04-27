package testFour.two;

public class Test {
    public static void main(String[] args) {
        // 创建被适配者类
        Replacement replacement = new Replacement();
        // 创建适配器
        Adapter adapter = new Adapter(replacement);
        adapter.work();
        // 创建代理
        Agent agent = new Agent();
        // 代理工作
        agent.work();
    }
}
