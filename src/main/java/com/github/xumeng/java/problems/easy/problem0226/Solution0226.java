package com.github.xumeng.java.problems.easy.problem0226;

import com.github.xumeng.java.common.datastructure.TreeNode;

public class Solution0226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            invertTree(root.left);
        }
        if (root.right != null) {
            invertTree(root.right);
        }
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        return root;
    }

}
