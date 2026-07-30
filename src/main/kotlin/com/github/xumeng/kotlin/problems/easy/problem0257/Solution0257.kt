package com.github.xumeng.kotlin.problems.easy.problem0257

import com.github.xumeng.kotlin.common.datastructure.TreeNode

class Solution0257 {

    fun binaryTreePaths(root: TreeNode?): List<String> {
        val paths: MutableList<String> = mutableListOf()
        if (root == null) {
            return paths
        }
        if (root.left == null && root.right == null) {
            paths.add(root.value.toString())
        }
        if (root.left != null) {
            val pathsOfLeft: List<String> = binaryTreePaths(root.left)
            for (path: String in pathsOfLeft) {
                paths.add(root.value.toString() + "->" + path)
            }
        }
        if (root.right != null) {
            val pathsOfRight: List<String> = binaryTreePaths(root.right)
            for (path: String in pathsOfRight) {
                paths.add(root.value.toString() + "->" + path)
            }
        }
        return paths
    }

}