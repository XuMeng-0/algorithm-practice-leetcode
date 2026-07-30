package com.github.xumeng.java.problems.easy.problem0257;

import com.github.xumeng.java.common.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution0257Test {

    private final Solution0257 solution = new Solution0257();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        List<String> paths = solution.binaryTreePaths(root);
        String[] expected = {"1"};
        assertEquals(expected.length, paths.size());
        for (String element : expected) {
            assertTrue(paths.contains(element));
        }
    }

    @Test
    public void test2() {
        TreeNode node3 = new TreeNode(5);
        TreeNode node1 = new TreeNode(2, null, node3);
        TreeNode node2 = new TreeNode(3);
        TreeNode root = new TreeNode(1, node1, node2);
        List<String> paths = solution.binaryTreePaths(root);
        String[] expected = {"1->2->5", "1->3"};
        assertEquals(expected.length, paths.size());
        for (String element : expected) {
            assertTrue(paths.contains(element));
        }
    }

}