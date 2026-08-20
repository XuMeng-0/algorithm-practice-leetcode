package com.github.xumeng.kotlin.problems.easy.problem0290

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0290Test {

    private val solution = Solution0290()

    @Test
    fun test1() {
        val pattern = "abba"
        val s = "dog cat cat dog"
        val suitable = solution.wordPattern(pattern, s)
        assertTrue(suitable)
    }

    @Test
    fun test2() {
        val pattern = "abba"
        val s = "dog cat cat fish"
        val suitable = solution.wordPattern(pattern, s)
        assertFalse(suitable)
    }

    @Test
    fun test3() {
        val pattern = "aaaa"
        val s = "dog cat cat dog"
        val suitable = solution.wordPattern(pattern, s)
        assertFalse(suitable)
    }

    @Test
    fun test4() {
        val pattern = "a"
        val s = "dog"
        val suitable = solution.wordPattern(pattern, s)
        assertTrue(suitable)
    }

    @Test
    fun test5() {
        val pattern = "a"
        val s = "dog cat"
        val suitable = solution.wordPattern(pattern, s)
        assertFalse(suitable)
    }

    @Test
    fun test6() {
        val pattern = "ab"
        val s = "cat cat"
        val suitable = solution.wordPattern(pattern, s)
        assertFalse(suitable)
    }

}