package com.github.xumeng.problems.easy.problem0222;

import com.github.xumeng.common.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionJava0222Test {

    private final SolutionJava0222S1 solution = new SolutionJava0222S1();

    @Test
    public void test1() {
        int count = solution.countNodes(null);
        assertEquals(0, count);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);
        int count = solution.countNodes(root);
        assertEquals(1, count);
    }

    @Test
    public void test3() {
        TreeNode node6 = new TreeNode(6);
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);

        TreeNode node3 = new TreeNode(3, node6, null);
        TreeNode node2 = new TreeNode(2, node4, node5);

        TreeNode root = new TreeNode(1, node2, node3);

        int count = solution.countNodes(root);
        assertEquals(6, count);
    }

    @Test
    public void test4() {
        TreeNode node15 = new TreeNode(15);
        TreeNode node14 = new TreeNode(14);
        TreeNode node13 = new TreeNode(13);
        TreeNode node12 = new TreeNode(12);
        TreeNode node11 = new TreeNode(11);
        TreeNode node10 = new TreeNode(10);
        TreeNode node9 = new TreeNode(9);
        TreeNode node8 = new TreeNode(8);

        TreeNode node7 = new TreeNode(7, node14, node15);
        TreeNode node6 = new TreeNode(6, node12, node13);
        TreeNode node5 = new TreeNode(5, node10, node11);
        TreeNode node4 = new TreeNode(4, node8, node9);

        TreeNode node3 = new TreeNode(3, node6, node7);
        TreeNode node2 = new TreeNode(2, node4, node5);

        TreeNode root = new TreeNode(1, node2, node3);

        int count = solution.countNodes(root);
        assertEquals(15, count);
    }

}