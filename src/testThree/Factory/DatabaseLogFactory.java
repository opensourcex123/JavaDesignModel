package testThree.Factory;

// 定义具体数据库日志工厂，实现抽象日志工厂接口
public class DatabaseLogFactory implements LogFactory{
    @Override
    public Log createLog() {
        return new DatabaseLog();
    }
}
