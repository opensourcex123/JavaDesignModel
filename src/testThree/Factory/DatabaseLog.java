package testThree.Factory;

// 声明具体日志，实现抽象日志接口
public class DatabaseLog implements Log{
    @Override
    public void writeLog() {
        System.out.println("一条数据库日志");
    }
}
