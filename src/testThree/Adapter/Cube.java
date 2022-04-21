package testThree.Adapter;

// 定义被适配者立方体类
public class Cube {
    private double width;

    // 构造函数
    public Cube(double width) {
        this.width = width;
    }

    public double calculateVolume() {
        return Math.pow(this.width, 3);
    }

    public double calculateFaceArea() {
        return 6 * Math.pow(this.width, 2);
    }

    // 获取正方体边长作为球的半径
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
