package com.github.xumeng.kotlin.problems.easy.problem0232

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MyQueue0232Test {

    @Test
    fun test() {
        val queue = MyQueue0232()
        queue.push(1)
        queue.push(2)
        assertEquals(1, queue.peek())
        assertEquals(1, queue.pop())
        assertFalse { queue.empty() }
    }
}
