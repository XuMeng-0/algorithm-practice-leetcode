package com.github.xumeng.problems.easy.problem0219;

public class Solution0219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int numsLength = nums.length;
        for (int i = 0; i < numsLength; i++) {
            int min = Math.max(i - k, 0);
            int max = Math.min(i + k, numsLength);
            for (int j = min; j < max; j++) {
                if (i != j && nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
