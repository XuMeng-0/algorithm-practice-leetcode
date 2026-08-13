package com.github.xumeng.kotlin.problems.easy.problem0278

class Solution0278 {

    private var badVersion: Int = 1

    fun setBacVersion(version: Int) {
        badVersion = version
    }

    fun firstBadVersion(n: Int): Int {
        for (i in 1..n) {
            if (isBadVersion(i)) {
                return i
            }
        }
        return 1
    }

    fun isBadVersion(version: Int): Boolean {
        return version >= badVersion
    }
}