package testThree.Factory;

// 定义具体文件日志工厂，实现抽象日志工厂接口
public class FileLogFactory implements LogFactory{
    @Override
    public Log createLog() {
        return new FileLog();
    }
}
