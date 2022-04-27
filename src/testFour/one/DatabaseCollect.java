package testFour.one;

// 桥接模式的具体实现者
public class DatabaseCollect extends DataCollect {
    @Override
    public void dataCollect() {
        System.out.println("读取数据库内容...");
    }
}
