package testFour.one;

// 报表展示，作为桥接模式的抽象角色
public abstract class ReportDisplay {
    DataCollect dataCollect;
    public abstract void display();
}
