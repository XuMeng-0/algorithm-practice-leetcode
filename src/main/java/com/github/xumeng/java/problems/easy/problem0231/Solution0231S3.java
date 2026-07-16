package com.github.xumeng.java.problems.easy.problem0231;

public class Solution0231S3 {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        int result = n >>> 1;
        if (result * 2 == n) {
            return true;
        }
        return result == 0;
    }

}
