package com.github.xumeng.java.problems.medium.problem0080;

public class Solution0080 {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int length = nums.length;
        while (true) {
            int duplicateCount = 0;
            int lastNumber = nums[0];
            boolean lengthChanged = false;
            for (int i = 1; i < length; i++) {
                if (lengthChanged) {
                    nums[i - 1] = nums[i];
                } else {
                    if (nums[i] == lastNumber) {
                        duplicateCount++;
                        if (duplicateCount == 2) {
                            lengthChanged = true;
                        }
                    } else {
                        duplicateCount = 0;
                    }
                    lastNumber = nums[i];
                }
            }
            if (lengthChanged) {
                length--;
            } else {
                break;
            }
        }
        return length;
    }

}
