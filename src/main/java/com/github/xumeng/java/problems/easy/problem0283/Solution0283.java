package com.github.xumeng.java.problems.easy.problem0283;

public class Solution0283 {

    public void moveZeroes(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] != 0) {
                    continue;
                }
                if (nums[j] == 0) {
                    continue;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }

}
