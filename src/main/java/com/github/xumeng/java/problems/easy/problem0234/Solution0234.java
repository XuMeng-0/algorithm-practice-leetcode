package com.github.xumeng.java.problems.easy.problem0234;

import com.github.xumeng.java.common.datastructure.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution0234 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> elementList = new ArrayList<>();
        ListNode node = head;
        do {
            elementList.add(node.value);
            node = node.next;
        } while (node != null);
        int size = elementList.size();
        for (int i = 0, j = size - 1; i <= j; i++, j--) {
            Integer e1 = elementList.get(i);
            Integer e2 = elementList.get(j);
            if (!Objects.equals(e1, e2)) {
                return false;
            }
        }
        return true;
    }

}
