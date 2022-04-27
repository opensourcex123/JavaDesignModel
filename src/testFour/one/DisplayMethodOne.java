package testFour.one;

// 第一种展示方式，作为细化抽象角色
public class DisplayMethodOne extends ReportDisplay {

    @Override
    public void display() {
        System.out.println("展示方式一：");
        dataCollect = new DatabaseCollect();
        dataCollect.dataCollect();
    }
}
