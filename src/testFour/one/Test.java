package testFour.one;

public class Test {
    public static void main(String[] args) {
        // 定义被适配者
        ExcelApi excelApi = new ExcelApi();
        // 定义适配器
        ExcelCollect excelCollect = new ExcelCollect(excelApi);
        excelCollect.dataCollect();
        // 定义细化抽象角色类，展示方式一
        DisplayMethodOne displayMethodOne = new DisplayMethodOne();
        displayMethodOne.display();
        // 定义细化抽象角色类，展示方式二
        DisplayMethodTwo displayMethodTwo = new DisplayMethodTwo();
        displayMethodTwo.display();
    }
}
