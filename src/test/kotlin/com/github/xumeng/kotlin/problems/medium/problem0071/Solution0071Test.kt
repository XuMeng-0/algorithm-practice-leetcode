package com.github.xumeng.kotlin.problems.medium.problem0071

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0071Test {


    private val solution = Solution0071()

    @Test
    fun test1() {
        val path = "/home/"
        val canonicalPath = solution.simplifyPath(path)
        val expected = "/home"
        assertEquals(expected, canonicalPath)
    }

    @Test
    fun test2() {
        val path = "/home//foo/"
        val canonicalPath = solution.simplifyPath(path)
        val expected = "/home/foo"
        assertEquals(expected, canonicalPath)
    }

    @Test
    fun test3() {
        val path = "/home/user/Documents/../Pictures"
        val canonicalPath = solution.simplifyPath(path)
        val expected = "/home/user/Pictures"
        assertEquals(expected, canonicalPath)
    }

    @Test
    fun test4() {
        val path = "/../"
        val canonicalPath = solution.simplifyPath(path)
        val expected = "/"
        assertEquals(expected, canonicalPath)
    }

    @Test
    fun test5() {
        val path = "/.../a/../b/c/../d/./"
        val canonicalPath = solution.simplifyPath(path)
        val expected = "/.../b/d"
        assertEquals(expected, canonicalPath)
    }

    @Test
    fun test6() {
        val path = "/"
        val canonicalPath = solution.simplifyPath(path)
        val expected = "/"
        assertEquals(expected, canonicalPath)
    }

}