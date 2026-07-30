package com.github.xumeng.kotlin.problems.easy.problem0257

import com.github.xumeng.kotlin.common.datastructure.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Solution0257Test {

    private val solution = Solution0257()

    @Test
    fun test1() {
        val root = TreeNode(1)
        val paths: List<String> = solution.binaryTreePaths(root)
        val expected: Array<String> = arrayOf("1")
        assertEquals(expected.size, paths.size)
        for (element: String in expected) {
            assertTrue(paths.contains(element))
        }
    }

    @Test
    fun test2() {
        val node3 = TreeNode(5)
        val node1 = TreeNode(2, null, node3)
        val node2 = TreeNode(3)
        val root = TreeNode(1, node1, node2)
        val paths: List<String> = solution.binaryTreePaths(root)
        val expected: Array<String> = arrayOf("1->2->5", "1->3")
        assertEquals(expected.size, paths.size)
        for (element: String in expected) {
            assertTrue(paths.contains(element))
        }
    }

}