package com.github.xumeng.problems.easy.problem0219;

public class Solution0219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int numsLength = nums.length;
        for (int i = 0; i < numsLength; i++) {
            int max = Math.min(i + k, numsLength - 1);
            for (int j = i + 1; j <= max; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
