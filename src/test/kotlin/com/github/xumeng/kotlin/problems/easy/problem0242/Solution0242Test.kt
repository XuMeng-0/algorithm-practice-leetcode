package com.github.xumeng.kotlin.problems.easy.problem0242

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0242Test {

    private val solution = Solution0242()

    @Test
    fun test1() {
        val s = "anagram"
        val t = "nagaram"
        val isAnagram = solution.isAnagram(s, t)
        assertTrue(isAnagram)
    }

    @Test
    fun test2() {
        val s = "rat"
        val t = "car"
        val isAnagram = solution.isAnagram(s, t)
        assertFalse(isAnagram)
    }

    @Test
    fun test3() {
        val s = "a"
        val t = "b"
        val isAnagram = solution.isAnagram(s, t)
        assertFalse(isAnagram)
    }

    @Test
    fun test4() {
        val s = "a"
        val t = "a"
        val isAnagram = solution.isAnagram(s, t)
        assertTrue(isAnagram)
    }

    @Test
    fun test5() {
        val s = "a"
        val t = "ab"
        val isAnagram = solution.isAnagram(s, t)
        assertFalse(isAnagram)
    }

    @Test
    fun test6() {
        val s = "ab"
        val t = "a"
        val isAnagram = solution.isAnagram(s, t)
        assertFalse(isAnagram)
    }

    @Test
    fun test7() {
        val s = "ba"
        val t = "ab"
        val isAnagram = solution.isAnagram(s, t)
        assertTrue(isAnagram)
    }

}