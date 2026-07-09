package com.github.xumeng.java.problems.easy.problem0226;

import com.github.xumeng.java.common.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution0226Test {

    private final Solution0226 solution = new Solution0226();

    @Test
    public void test1() {
        TreeNode result = solution.invertTree(null);
        Integer[] expected = {};
        assertArrayEquals(expected, traverseTree(result).toArray());
    }

    @Test
    public void test2() {
        TreeNode node1 = new TreeNode(2);

        TreeNode root = new TreeNode(4, node1, null);
        TreeNode result = solution.invertTree(root);
        Integer[] expected = {4, null, 2};
        assertArrayEquals(expected, traverseTree(result).toArray());
    }

    @Test
    public void test3() {
        TreeNode node1 = new TreeNode(2);

        TreeNode root = new TreeNode(4, null, node1);
        TreeNode result = solution.invertTree(root);
        Integer[] expected = {4, 2, null};
        assertArrayEquals(expected, traverseTree(result).toArray());
    }

    @Test
    public void test4() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);

        TreeNode root = new TreeNode(2, node1, node2);
        TreeNode result = solution.invertTree(root);
        Integer[] expected = {2, 3, 1};
        assertArrayEquals(expected, traverseTree(result).toArray());
    }

    @Test
    public void test5() {
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(9);

        TreeNode node1 = new TreeNode(2, node3, node4);
        TreeNode node2 = new TreeNode(7, node5, node6);

        TreeNode root = new TreeNode(4, node1, node2);
        TreeNode result = solution.invertTree(root);
        Integer[] expected = {4, 7, 9, 6, 2, 3, 1};
        assertArrayEquals(expected, traverseTree(result).toArray());
    }

    private ArrayList<Integer> traverseTree(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        result.add(root.val);
        if (root.left == null && root.right == null) {
            return result;
        }
        if (root.left == null) {
            result.add(null);
        } else {
            result.addAll(traverseTree(root.left));
        }
        if (root.right == null) {
            result.add(null);
        } else {
            result.addAll(traverseTree(root.right));
        }
        return result;
    }

}