package testFour.one;

// 适配器，同时作为桥接模式的具体实现者
public class ExcelCollect extends DataCollect{
    ExcelApi adaptee;

    public ExcelCollect(ExcelApi adaptee) {
        super();
        this.adaptee = adaptee;
    }
    @Override
    public void dataCollect() {
        adaptee.GetExcel();
    }
}
