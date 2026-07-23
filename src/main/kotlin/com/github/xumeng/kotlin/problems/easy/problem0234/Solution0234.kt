package com.github.xumeng.kotlin.problems.easy.problem0234

import com.github.xumeng.kotlin.common.datastructure.ListNode

class Solution0234 {

    fun isPalindrome(head: ListNode?): Boolean {
        val elementList = mutableListOf<Int>()
        var node = head
        do {
            if (node != null) {
                elementList.add(node.value)
                node = node.next
            }
        } while (node != null)
        var i = 0
        var j = elementList.size - 1
        while (i <= j) {
            val e1: Int = elementList.get(i)
            val e2: Int = elementList.get(j)
            if (e1 != e2) {
                return false
            }
            i++
            j--
        }
        return true
    }

}