package com.github.xumeng.java.problems.medium.problem0061;

import com.github.xumeng.java.common.datastructure.ListNode;

public class Solution0061 {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int listLength = calculateListLength(head);
        k = k % listLength;
        while (k > 0) {
            head = moveLastToFirst(head);
            k--;
        }
        return head;
    }

    private int calculateListLength(ListNode head) {
        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    private ListNode moveLastToFirst(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode lastNode = null;
        ListNode node = head;
        while (node != null) {
            if (node.next != null && node.next.next == null) {
                lastNode = node.next;
                node.next = null;
            }
            node = node.next;
        }
        assert lastNode != null;
        lastNode.next = head;
        head = lastNode;
        return head;
    }

}
