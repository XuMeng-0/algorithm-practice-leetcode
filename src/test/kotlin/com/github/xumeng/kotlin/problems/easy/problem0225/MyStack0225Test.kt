package com.github.xumeng.kotlin.problems.easy.problem0225

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MyStack0225Test {

    @Test
    fun test() {
        val stack = MyStack0225()
        stack.push(1)
        stack.push(2)
        assertEquals(2, stack.top())
        assertEquals(2, stack.pop())
        assertFalse { stack.empty() }
    }

}