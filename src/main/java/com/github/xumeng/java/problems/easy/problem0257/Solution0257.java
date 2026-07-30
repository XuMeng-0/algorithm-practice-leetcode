package com.github.xumeng.java.problems.easy.problem0257;

import com.github.xumeng.java.common.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution0257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        if (root.left == null && root.right == null) {
            paths.add(String.valueOf(root.val));
        }
        if (root.left != null) {
            List<String> pathsOfLeft = binaryTreePaths(root.left);
            for (String path : pathsOfLeft) {
                paths.add(root.val + "->" + path);
            }
        }
        if (root.right != null) {
            List<String> pathsOfRight = binaryTreePaths(root.right);
            for (String path : pathsOfRight) {
                paths.add(root.val + "->" + path);
            }
        }
        return paths;
    }

}
