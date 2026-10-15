package com.github.xumeng.java.problems.easy.problem0349;

import java.util.ArrayList;
import java.util.List;

public class Solution0349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> intersectionList = new ArrayList<>();
        for (int num : nums1) {
            if (!arrayContainsElement(nums2, num)) {
                continue;
            }
            if (!intersectionList.contains(num)) {
                intersectionList.add(num);
            }
        }
        int size = intersectionList.size();
        int[] intersectionArray = new int[size];
        for (int i = 0; i < size; i++) {
            intersectionArray[i] = intersectionList.get(i);
        }
        return intersectionArray;
    }

    private boolean arrayContainsElement(int[] array, int element) {
        for (int num : array) {
            if (element == num) {
                return true;
            }
        }
        return false;
    }

}
