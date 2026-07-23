package com.github.xumeng.java.problems.easy.problem0234;

import com.github.xumeng.java.common.datastructure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0234Test {

    private final Solution0234 solution = new Solution0234();

    @Test
    public void test1() {
        ListNode head = new ListNode(1);
        boolean isPalindrome = solution.isPalindrome(head);
        assertTrue(isPalindrome);
    }

    @Test
    public void test2() {
        ListNode node = new ListNode(2);
        ListNode head = new ListNode(1, node);
        boolean isPalindrome = solution.isPalindrome(head);
        assertFalse(isPalindrome);
    }

    @Test
    public void test3() {
        ListNode node3 = new ListNode(1);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);
        boolean isPalindrome = solution.isPalindrome(head);
        assertTrue(isPalindrome);
    }

}