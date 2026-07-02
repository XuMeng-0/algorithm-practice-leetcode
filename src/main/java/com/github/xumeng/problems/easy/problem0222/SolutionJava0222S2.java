package com.github.xumeng.problems.easy.problem0222;

import com.github.xumeng.common.datastructure.TreeNode;

public class SolutionJava0222S2 {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        count += countNodes(root.left);
        count += countNodes(root.right);
        return count;
    }

}
