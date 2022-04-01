package testOne.strategy;

import testOne.strategy.concreteStrategy.BubbleSort;
import testOne.strategy.concreteStrategy.HeapSort;
import testOne.strategy.concreteStrategy.MergeSort;
import testOne.strategy.concreteStrategy.QuickSort;
import testOne.strategy.context.Client;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // 创建上下文对象
        Client client = new Client();
        // 选择策略
         int[] nums = {16, 7, 3, 20, 17, 8};
        client.setSortAlgorithm(new BubbleSort());
        client.sort(nums);
        System.out.println("冒泡排序结果：" + Arrays.toString(nums));

        nums = new int[]{16, 7, 3, 20, 17, 8};
        client.setSortAlgorithm(new HeapSort());
        client.sort(nums);
        System.out.println("堆排序结果：" + Arrays.toString(nums));

        nums = new int[]{16, 7, 3, 20, 17, 8};
        client.setSortAlgorithm(new MergeSort());
        client.sort(nums);
        System.out.println("归并排序结果：" + Arrays.toString(nums));

        nums = new int[]{16, 7, 3, 20, 17, 8};
        client.setSortAlgorithm(new QuickSort());
        client.sort(nums);
        System.out.println("快速排序结果：" + Arrays.toString(nums));
    }
}
