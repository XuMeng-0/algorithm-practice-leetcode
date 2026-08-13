package com.github.xumeng.kotlin.problems.easy.problem0278

class Solution0278 {

    private var badVersion: Int = 1

    fun setBacVersion(version: Int) {
        badVersion = version
    }

    fun firstBadVersion(n: Int): Int {
        var start = 1
        var end = n
        var middle: Long
        while (start < end) {
            middle = (start.toLong() + end.toLong()) / 2
            if (isBadVersion(middle.toInt())) {
                end = middle.toInt()
            } else {
                if (start.toLong() == middle) {
                    return end
                }
                start = middle.toInt()
            }
        }
        return end
    }

    fun isBadVersion(version: Int): Boolean {
        return version >= badVersion
    }
}