package com.github.xumeng.java.problems.easy.problem0278;

public class Solution0278 {

    private int badVersion = 1;

    public void setBadVersion(int version) {
        badVersion = version;
    }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int middle;
        while (start < end) {
            long sum = (long) start + (long) end;
            middle = (int) (sum / 2);
            if (isBadVersion(middle)) {
                end = middle;
            } else {
                if (start == middle) {
                    return end;
                }
                start = middle;
            }
        }
        return end;
    }

    private boolean isBadVersion(int version) {
        return version >= badVersion;
    }

}
