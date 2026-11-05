package com.github.xumeng.kotlin.problems.easy.problem0374

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0374Test {

    private val solution = Solution0374()


    @Test
    fun test1() {
        val n = 10
        val pick = 6
        solution.setNumber(pick)
        val number = solution.guessNumber(n)
        assertEquals(pick, number)
    }

    @Test
    fun test2() {
        val n = 1
        val pick = 1
        solution.setNumber(pick)
        val number = solution.guessNumber(n)
        assertEquals(pick, number)
    }

    @Test
    fun test3() {
        val n = 2
        val pick = 1
        solution.setNumber(pick)
        val number = solution.guessNumber(n)
        assertEquals(pick, number)
    }

    @Test
    fun test4() {
        val n = 2147483647
        val pick = 2147483640
        solution.setNumber(pick)
        val number = solution.guessNumber(n)
        assertEquals(pick, number)
    }

    @Test
    fun test5() {
        val n = 50
        val pick = 20
        solution.setNumber(pick)
        val number = solution.guessNumber(n)
        assertEquals(pick, number)
    }

    @Test
    fun test6() {
        val n = 2
        val pick = 2
        solution.setNumber(pick)
        val number = solution.guessNumber(n)
        assertEquals(pick, number)
    }

}