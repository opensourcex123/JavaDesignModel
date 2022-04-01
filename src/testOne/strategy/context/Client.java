package testOne.strategy.context;

import testOne.strategy.interfaceStrategy.SortAlgorithm;

// 调用具体策略的上下文
public class Client {
    SortAlgorithm sortAlgorithm;

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int[] sort(int[] nums) {
        if (sortAlgorithm != null) {
            return sortAlgorithm.sort(nums);
        } else {
            return null;
        }
    }
}
