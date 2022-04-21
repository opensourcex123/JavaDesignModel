package testThree.Factory;

// 声明具体日志，实现抽象日志接口
public class FileLog implements Log{
    @Override
    public void writeLog() {
        System.out.println("一条文件日志");
    }
}
