package com.github.xumeng.java.problems.easy.problem0242;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Solution0242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charactersOfS = countCharacters(s);
        Map<Character, Integer> charactersOfT = countCharacters(t);
        int size1 = charactersOfS.size();
        int size2 = charactersOfT.size();
        if (size1 != size2) {
            return false;
        }
        Set<Character> characters = charactersOfS.keySet();
        for (Character character : characters) {
            Integer countS = charactersOfS.get(character);
            Integer countT = charactersOfT.get(character);
            if (!Objects.equals(countS, countT)) {
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> countCharacters(String s) {
        Map<Character, Integer> charactersMap = new HashMap<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char character = s.charAt(i);
            Integer count = charactersMap.get(character);
            if (count != null) {
                count++;
            } else {
                count = 1;
            }
            charactersMap.put(character, count);
        }
        return charactersMap;
    }

}
