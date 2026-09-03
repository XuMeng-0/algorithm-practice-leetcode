package com.github.xumeng.kotlin.problems.medium.problem0061

import com.github.xumeng.kotlin.common.datastructure.ListNode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0061Test {

    private val solution: Solution0061 = Solution0061()

    @Test
    fun test1() {
        val node5 = ListNode(5)
        val node4 = ListNode(4)
        val node3 = ListNode(3)
        val node2 = ListNode(2)
        val head = ListNode(1)
        head.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5
        val result = solution.rotateRight(head, 1)
        val expected = intArrayOf(5, 1, 2, 3, 4)
        assertArrayEquals(expected, generateArray(result))
    }

    @Test
    fun test2() {
        val node5 = ListNode(5)
        val node4 = ListNode(4)
        val node3 = ListNode(3)
        val node2 = ListNode(2)
        val head = ListNode(1)
        head.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5
        val result = solution.rotateRight(head, 2)
        val expected = intArrayOf(4, 5, 1, 2, 3)
        assertArrayEquals(expected, generateArray(result))
    }

    @Test
    fun test3() {
        val node2 = ListNode(2)
        val node1 = ListNode(1)
        val head = ListNode(0)
        head.next = node1
        node1.next = node2
        val result = solution.rotateRight(head, 0)
        val expected = intArrayOf(0, 1, 2)
        assertArrayEquals(expected, generateArray(result))
    }

    @Test
    fun test4() {
        val node2 = ListNode(2)
        val node1 = ListNode(1)
        val head = ListNode(0)
        head.next = node1
        node1.next = node2
        val result = solution.rotateRight(head, 1)
        val expected = intArrayOf(2, 0, 1)
        assertArrayEquals(expected, generateArray(result))
    }

    @Test
    fun test5() {
        val node2 = ListNode(2)
        val node1 = ListNode(1)
        val head = ListNode(0)
        head.next = node1
        node1.next = node2
        val result = solution.rotateRight(head, 2)
        val expected = intArrayOf(1, 2, 0)
        assertArrayEquals(expected, generateArray(result))
    }

    @Test
    fun test6() {
        val node2 = ListNode(2)
        val node1 = ListNode(1)
        val head = ListNode(0)
        head.next = node1
        node1.next = node2
        val result = solution.rotateRight(head, 3)
        val expected = intArrayOf(0, 1, 2)
        assertArrayEquals(expected, generateArray(result))
    }

    @Test
    fun test7() {
        val node2 = ListNode(2)
        val node1 = ListNode(1)
        val head = ListNode(0)
        head.next = node1
        node1.next = node2
        val result = solution.rotateRight(head, 4)
        val expected = intArrayOf(2, 0, 1)
        assertArrayEquals(expected, generateArray(result))
    }

    @Test
    fun test8() {
        val result = solution.rotateRight(null, 1)
        val expected = intArrayOf()
        assertArrayEquals(expected, generateArray(result))
    }

    @Test
    fun test9() {
        val head = ListNode(0)
        val result = solution.rotateRight(head, 1)
        val expected = intArrayOf(0)
        assertArrayEquals(expected, generateArray(result))
    }

    @Test
    fun test10() {
        val node1 = ListNode(1)
        val head = ListNode(0)
        head.next = node1
        val result = solution.rotateRight(head, 1)
        val expected = intArrayOf(1, 0)
        assertArrayEquals(expected, generateArray(result))
    }

    private fun generateArray(head: ListNode?): IntArray {
        var node = head
        val elements = mutableListOf<Int>()
        while (node != null) {
            elements.add(node.value)
            node = node.next
        }
        return elements.toIntArray()
    }

}