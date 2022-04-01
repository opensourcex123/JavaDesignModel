package testOne.strategy.concreteStrategy;

import testOne.strategy.interfaceStrategy.SortAlgorithm;

public class BubbleSort implements SortAlgorithm {

    @Override
    public int[] sort(int[] nums) {
        int i, j;
        int n = nums.length;

        for (i = 0; i < n; i++) {
            for (j = 1; j < n - i; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp;
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
}