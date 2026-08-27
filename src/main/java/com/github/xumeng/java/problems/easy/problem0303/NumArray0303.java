package com.github.xumeng.java.problems.easy.problem0303;

public class NumArray0303 {

    private final int[] nums;


    public NumArray0303(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }

}
