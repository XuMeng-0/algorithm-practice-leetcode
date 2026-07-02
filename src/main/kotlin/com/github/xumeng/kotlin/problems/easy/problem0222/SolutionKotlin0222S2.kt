package com.github.xumeng.kotlin.problems.easy.problem0222

import com.github.xumeng.kotlin.common.datastructure.TreeNode

class SolutionKotlin0222S2 {

    fun countNodes(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        var count = 1
        count += countNodes(root.left)
        count += countNodes(root.right)
        return count
    }

}