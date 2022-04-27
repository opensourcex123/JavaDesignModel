package testFour.one;

// 第二种展示方式，作为细化抽象角色
public class DisplayMethodTwo extends ReportDisplay {
    @Override
    public void display() {
        System.out.println("展示方式2：");
        dataCollect = new TextCollect();
        dataCollect.dataCollect();
    }
}
