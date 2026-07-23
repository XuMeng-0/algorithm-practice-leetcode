package com.github.xumeng.kotlin.problems.easy.problem0234

import com.github.xumeng.kotlin.common.datastructure.ListNode
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Solution0234Test {

    private val solution: Solution0234 = Solution0234()

    @Test
    fun test1() {
        val head = ListNode(1)
        val isPalindrome: Boolean = solution.isPalindrome(head)
        assertTrue(isPalindrome)
    }

    @Test
    fun test2() {
        val node = ListNode(2)
        val head = ListNode(1)
        head.next = node
        val isPalindrome: Boolean = solution.isPalindrome(head)
        assertFalse(isPalindrome)
    }

    @Test
    fun test3() {
        val node3 = ListNode(1)
        val node2 = ListNode(2)
        node2.next = node3
        val node1 = ListNode(2)
        node1.next = node2
        val head = ListNode(1)
        head.next = node1
        val isPalindrome: Boolean = solution.isPalindrome(head)
        assertTrue(isPalindrome)
    }

}