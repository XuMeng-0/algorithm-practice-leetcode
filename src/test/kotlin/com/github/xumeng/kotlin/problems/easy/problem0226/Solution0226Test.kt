package com.github.xumeng.kotlin.problems.easy.problem0226

import com.github.xumeng.kotlin.common.datastructure.TreeNode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0226Test {

    private val solution: Solution0226 = Solution0226()

    @Test
    fun test1() {
        val result = solution.invertTree(null)
        val expected: Array<Int?> = arrayOf()
        assertArrayEquals(expected, traverseTree(result).toTypedArray())
    }

    @Test
    fun test2() {
        val node1 = TreeNode(2)
        val root = TreeNode(4, node1, null)
        val result = solution.invertTree(root)
        val expected: Array<Int?> = arrayOf(4, null, 2)
        assertArrayEquals(expected, traverseTree(result).toTypedArray())
    }

    @Test
    fun test3() {
        val node1 = TreeNode(2)
        val root = TreeNode(4, null, node1)
        val result = solution.invertTree(root)
        val expected: Array<Int?> = arrayOf(4, 2, null)
        assertArrayEquals(expected, traverseTree(result).toTypedArray())
    }

    @Test
    fun test4() {
        val node1 = TreeNode(1)
        val node2 = TreeNode(3)

        val root = TreeNode(2, node1, node2)
        val result = solution.invertTree(root)
        val expected: Array<Int?> = arrayOf(2, 3, 1)
        assertArrayEquals(expected, traverseTree(result).toTypedArray())
    }

    @Test
    fun test5() {
        val node3 = TreeNode(1)
        val node4 = TreeNode(3)
        val node5 = TreeNode(6)
        val node6 = TreeNode(9)

        val node1 = TreeNode(2, node3, node4)
        val node2 = TreeNode(7, node5, node6)

        val root = TreeNode(4, node1, node2)
        val result = solution.invertTree(root)
        val expected: Array<Int?> = arrayOf(4, 7, 9, 6, 2, 3, 1)
        assertArrayEquals(expected, traverseTree(result).toTypedArray())
    }

    private fun traverseTree(root: TreeNode?): List<Int?> {
        val result: MutableList<Int?> = mutableListOf()
        if (root == null) {
            return result
        }
        result.add(root.value)
        if (root.left == null && root.right == null) {
            return result
        }
        if (root.left == null) {
            result.add(null)
        } else {
            result.addAll(traverseTree(root.left))
        }
        if (root.right == null) {
            result.add(null)
        } else {
            result.addAll(traverseTree(root.right))
        }
        return result
    }

}