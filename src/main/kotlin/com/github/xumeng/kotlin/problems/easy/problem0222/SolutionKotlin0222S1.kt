package com.github.xumeng.kotlin.problems.easy.problem0222

import com.github.xumeng.kotlin.common.datastructure.TreeNode

class SolutionKotlin0222S1 {

    fun countNodes(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        var count = 1
        if (root.left != null) {
            count += countNodes(root.left)
        }
        if (root.right != null) {
            count += countNodes(root.right)
        }
        return count
    }

}