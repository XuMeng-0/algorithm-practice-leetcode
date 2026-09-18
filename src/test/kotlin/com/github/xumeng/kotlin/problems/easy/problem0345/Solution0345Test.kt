package com.github.xumeng.kotlin.problems.easy.problem0345

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0345Test {

    private val solution = Solution0345()

    @Test
    fun test1() {
        val s = "IceCreAm"
        val result = solution.reverseVowels(s)
        val expected = "AceCreIm"
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val s = "leetcode"
        val result = solution.reverseVowels(s)
        val expected = "leotcede"
        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val s = "a"
        val result = solution.reverseVowels(s)
        val expected = "a"
        assertEquals(expected, result)
    }

    @Test
    fun test4() {
        val s = "b"
        val result = solution.reverseVowels(s)
        val expected = "b"
        assertEquals(expected, result)
    }

}