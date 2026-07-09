package com.github.xumeng.kotlin.problems.easy.problem0226

import com.github.xumeng.kotlin.common.datastructure.TreeNode

class Solution0226 {

    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        if (root.left != null) {
            invertTree(root.left)
        }
        if (root.right != null) {
            invertTree(root.right)
        }
        val node: TreeNode? = root.left
        root.left = root.right
        root.right = node
        return root
    }

}