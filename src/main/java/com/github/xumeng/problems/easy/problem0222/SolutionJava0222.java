package com.github.xumeng.problems.easy.problem0222;

import com.github.xumeng.common.datastructure.TreeNode;

public class SolutionJava0222 {

    public int countNodes(TreeNode root) {
        int count = 0;
        if (root == null) {
            return count;
        }
        count = 1;
        if (root.left != null) {
            count += countNodes(root.left);
        }
        if (root.right != null) {
            count += countNodes(root.right);
        }
        return count;
    }

}
