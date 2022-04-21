package testThree.Factory;

public class Client {
    public static void main(String[] args) {
        // 声明工厂和日志
        LogFactory logFactory;
        Log log;
        // 将工厂赋值为文件日志工厂，创建文件日志
        logFactory = new FileLogFactory();
        log = logFactory.createLog();
        log.writeLog();
        // 将工厂赋值为数据库日志工厂，创建数据库日志
        logFactory = new DatabaseLogFactory();
        log = logFactory.createLog();
        log.writeLog();
    }
}
