package testOne.strategy.concreteStrategy;

import testOne.strategy.interfaceStrategy.SortAlgorithm;

public class HeapSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] nums) {
        for (int i = (nums.length - 1) / 2; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(nums, i, nums.length);
        }

        //调整堆结构+交换堆顶元素与末尾元素
        for (int i = nums.length - 1; i > 0; i--) {
            //将堆顶元素与末尾元素进行交换
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;

            //重新对堆进行调整
            adjustHeap(nums, 0, i);
        }

        return nums;
    }

    private static void adjustHeap(int[] arr, int parent, int length) {
        //将temp作为父节点
        int temp = arr[parent];
        //左孩子
        int lChild = 2 * parent + 1;

        while (lChild < length) {
            //右孩子
            int rChild = lChild + 1;
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if (rChild < length && arr[lChild] < arr[rChild]) {
                lChild++;
            }

            // 如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp >= arr[lChild]) {
                break;
            }

            // 把孩子结点的值赋给父结点
            arr[parent] = arr[lChild];

            //选取孩子结点的左孩子结点,继续向下筛选
            parent = lChild;
            lChild = 2 * lChild + 1;
        }
        arr[parent] = temp;
    }
}
