package com.github.xumeng.java.problems.easy.problem0278;

public class Solution0278 {

    private int badVersion = 1;

    public void setBadVersion(int version) {
        badVersion = version;
    }

    public int firstBadVersion(int n) {
        return 1;
    }

    private boolean isBadVersion(int version) {
        return version >= badVersion;
    }

}
