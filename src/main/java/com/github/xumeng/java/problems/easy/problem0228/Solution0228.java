package com.github.xumeng.java.problems.easy.problem0228;

import java.util.ArrayList;
import java.util.List;

public class Solution0228 {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        int start = 0;
        int end = start;
        while (end + 1 < nums.length) {
            if (nums[end] + 1 == nums[end + 1]) {
                end++;
            } else {
                String element = start == end ? String.valueOf(nums[start]) : nums[start] + "->" + nums[end];
                result.add(element);
                start = end + 1;
                end = start;
            }
        }
        String element = start == end ? String.valueOf(nums[start]) : nums[start] + "->" + nums[end];
        result.add(element);
        return result;
    }

}
