package com.github.xumeng.java.problems.medium.problem0061;

import com.github.xumeng.java.common.datastructure.ListNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution0061Test {

    private final Solution0061 solution = new Solution0061();

    @Test
    public void test1() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);
        ListNode result = solution.rotateRight(head, 1);
        int[] expected = {5, 1, 2, 3, 4};
        assertArrayEquals(expected, generateArray(result));
    }

    @Test
    public void test2() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);
        ListNode result = solution.rotateRight(head, 2);
        int[] expected = {4, 5, 1, 2, 3};
        assertArrayEquals(expected, generateArray(result));
    }

    @Test
    public void test3() {
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = new ListNode(0, node1);
        ListNode result = solution.rotateRight(head, 0);
        int[] expected = {0, 1, 2};
        assertArrayEquals(expected, generateArray(result));
    }

    @Test
    public void test4() {
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = new ListNode(0, node1);
        ListNode result = solution.rotateRight(head, 1);
        int[] expected = {2, 0, 1};
        assertArrayEquals(expected, generateArray(result));
    }

    @Test
    public void test5() {
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = new ListNode(0, node1);
        ListNode result = solution.rotateRight(head, 2);
        int[] expected = {1, 2, 0};
        assertArrayEquals(expected, generateArray(result));
    }

    @Test
    public void test6() {
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = new ListNode(0, node1);
        ListNode result = solution.rotateRight(head, 3);
        int[] expected = {0, 1, 2};
        assertArrayEquals(expected, generateArray(result));
    }

    @Test
    public void test7() {
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = new ListNode(0, node1);
        ListNode result = solution.rotateRight(head, 4);
        int[] expected = {2, 0, 1};
        assertArrayEquals(expected, generateArray(result));
    }

    @Test
    public void test8() {
        ListNode result = solution.rotateRight(null, 1);
        int[] expected = {};
        assertArrayEquals(expected, generateArray(result));
    }

    @Test
    public void test9() {
        ListNode head = new ListNode(0);
        ListNode result = solution.rotateRight(head, 1);
        int[] expected = {0};
        assertArrayEquals(expected, generateArray(result));
    }

    @Test
    public void test10() {
        ListNode node1 = new ListNode(1);
        ListNode head = new ListNode(0, node1);
        ListNode result = solution.rotateRight(head, 1);
        int[] expected = {1, 0};
        assertArrayEquals(expected, generateArray(result));
    }

    private int[] generateArray(ListNode head) {
        ListNode node = head;
        List<Integer> elements = new ArrayList<>();
        while (node != null) {
            elements.add(node.value);
            node = node.next;
        }
        int[] array = new int[elements.size()];
        for (int i = 0; i < elements.size(); i++) {
            array[i] = elements.get(i);
        }
        return array;
    }

}