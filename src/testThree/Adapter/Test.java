package testThree.Adapter;

public class Test {
    public static void main(String[] args) {
        // 定义立方体
        Cube cube = new Cube(2.0);
        // 定义适配器
        MagicFinger finger = new MagicFinger(cube);
        // 通过立方体输出球体的体积和表面积
        System.out.println("体积：" + finger.calculateVolume());
        System.out.println("面积：" + finger.calculateArea());
    }
}
