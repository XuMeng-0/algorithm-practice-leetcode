package com.github.xumeng.kotlin.problems.easy.problem0222

import com.github.xumeng.kotlin.common.datastructure.TreeNode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKotlin0222Test {

    //    private val solution = SolutionKotlin0222S1()
    private val solution = SolutionKotlin0222S2()


    @Test
    fun test1() {
        val count: Int = solution.countNodes(null)
        assertEquals(0, count)
    }

    @Test
    fun test2() {
        val root = TreeNode(1)
        val count: Int = solution.countNodes(root)
        assertEquals(1, count)
    }

    @Test
    fun test3() {
        val node6 = TreeNode(6)
        val node5 = TreeNode(5)
        val node4 = TreeNode(4)

        val node3 = TreeNode(3, node6, null)
        val node2 = TreeNode(2, node4, node5)

        val root = TreeNode(1, node2, node3)

        val count: Int = solution.countNodes(root)
        assertEquals(6, count)
    }

    @Test
    fun test4() {
        val node15 = TreeNode(15)
        val node14 = TreeNode(14)
        val node13 = TreeNode(13)
        val node12 = TreeNode(12)
        val node11 = TreeNode(11)
        val node10 = TreeNode(10)
        val node9 = TreeNode(9)
        val node8 = TreeNode(8)

        val node7 = TreeNode(7, node14, node15)
        val node6 = TreeNode(6, node12, node13)
        val node5 = TreeNode(5, node10, node11)
        val node4 = TreeNode(4, node8, node9)

        val node3 = TreeNode(3, node6, node7)
        val node2 = TreeNode(2, node4, node5)

        val root = TreeNode(1, node2, node3)

        val count: Int = solution.countNodes(root)
        assertEquals(15, count)
    }

}