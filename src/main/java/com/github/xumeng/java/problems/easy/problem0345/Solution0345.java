package com.github.xumeng.java.problems.easy.problem0345;

public class Solution0345 {

    public String reverseVowels(String s) {
        char[] characters = s.toCharArray();
        char temp;
        for (int i = 0, j = characters.length - 1; i < j; ) {
            if (isNotVowel(characters[i])) {
                i++;
                continue;
            }
            if (isNotVowel(characters[j])) {
                j--;
                continue;
            }
            temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
            i++;
            j--;
        }
        return new String(characters);
    }

    private boolean isNotVowel(char character) {
        return switch (character) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> false;
            default -> true;
        };
    }

}
