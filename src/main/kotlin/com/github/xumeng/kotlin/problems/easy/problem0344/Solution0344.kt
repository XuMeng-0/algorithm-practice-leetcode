package com.github.xumeng.kotlin.problems.easy.problem0344

class Solution0344 {

    fun reverseString(s: CharArray) {
        if (s.size == 1) {
            return
        }
        var i = 0
        var j = s.size - 1
        var temp: Char
        while (i < j) {
            temp = s[i]
            s[i] = s[j]
            s[j] = temp
            i++
            j--
        }
    }

}