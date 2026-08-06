package com.github.xumeng.java.problems.easy.problem0268;

import java.util.Arrays;

public class Solution0268 {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0) {
            return 0;
        }
        for (int i = 0; i + 1 < nums.length; i++) {
            if (nums[i + 1] - nums[i] != 1) {
                return nums[i] + 1;
            }
        }
        return nums.length;
    }

}
