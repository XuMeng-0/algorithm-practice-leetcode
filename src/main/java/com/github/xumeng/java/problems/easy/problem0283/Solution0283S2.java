package com.github.xumeng.java.problems.easy.problem0283;

public class Solution0283S2 {

    public void moveZeroes(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j + 1 < length - i; j++) {
                if (nums[j] != 0) {
                    continue;
                }
                if (nums[j + 1] == 0) {
                    continue;
                }
                int temp = nums[j + 1];
                nums[j + 1] = nums[j];
                nums[j] = temp;
            }
        }
    }

}
