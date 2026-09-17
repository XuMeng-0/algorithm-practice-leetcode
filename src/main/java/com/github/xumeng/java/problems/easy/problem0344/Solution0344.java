package com.github.xumeng.java.problems.easy.problem0344;

public class Solution0344 {

    public void reverseString(char[] s) {
        if (s.length == 1) {
            return;
        }
        char temp;
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }

}
