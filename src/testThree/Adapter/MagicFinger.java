package testThree.Adapter;

// 定义适配器类
public class MagicFinger implements BallIF{
    private double radius = 0;
    private static double PI = 3.14d;
    private Cube adapter;

    // 构造器，将立方体的边长赋值给球体
    public MagicFinger(Cube adapter) {
        super();
        this.adapter = adapter;
        radius = this.adapter.getWidth();
    }
    // 计算球的表面积
    @Override
    public double calculateArea() {
        return PI * 4.0d * (radius * radius * radius);
    }
    // 计算球的体积
    @Override
    public double calculateVolume() {
        return  (4.0d/3.0d) * PI * (radius * radius);
    }
}
