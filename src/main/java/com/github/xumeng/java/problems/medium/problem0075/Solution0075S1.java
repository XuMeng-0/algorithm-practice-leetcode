package com.github.xumeng.java.problems.medium.problem0075;

// 插入排序
public class Solution0075S1 {

    public void sortColors(int[] nums) {
        int temp;
        for (int i = 1; i < nums.length; i++) {
            temp = nums[i];
            int j = i;
            for (; j >= 1; j--) {
                if (nums[j - 1] > temp) {
                    nums[j] = nums[j - 1];
                } else {
                    nums[j] = temp;
                    break;
                }
            }
            if (j == 0) {
                nums[0] = temp;
            }
        }
    }

}
