package com.github.xumeng.kotlin.problems.medium.problem0061

import com.github.xumeng.kotlin.common.datastructure.ListNode

class Solution0061 {

    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        if (head == null) {
            return null
        }
        val listLength = calculateListLength(head)
        var i = k % listLength
        var newHead: ListNode = head
        while (i > 0) {
            newHead = moveLastToFirst(newHead)
            i--
        }
        return newHead
    }

    private fun calculateListLength(head: ListNode?): Int {
        var node = head
        var length = 0
        while (node != null) {
            length++
            node = node.next
        }
        return length
    }

    private fun moveLastToFirst(head: ListNode): ListNode {
        if (head.next == null) {
            return head
        }
        var lastNode: ListNode? = null
        var node: ListNode? = head
        while (node != null) {
            val nextNode = node.next
            if (nextNode != null && nextNode.next == null) {
                lastNode = node.next
                node.next = null
            }
            node = node.next
        }
        if (lastNode == null) {
            return head
        }
        lastNode.next = head
        return lastNode
    }

}