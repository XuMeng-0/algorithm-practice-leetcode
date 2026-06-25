package com.github.xumeng.problems.easy.problem0205;

import java.util.HashMap;
import java.util.Map;

public class Solution0205 {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<String, String> characterMap = new HashMap<>();
        int stringLength = s.length();
        for (int i = 0; i < stringLength; i++) {
            String characterFromS = String.valueOf(s.charAt(i));
            String characterFromT = String.valueOf(t.charAt(i));
            String targetCharacter = characterMap.get(characterFromS);
            if (targetCharacter == null) {
                String substringOfT = t.substring(0, i);
                if (substringOfT.contains(characterFromT)) {
                    return false;
                }
                characterMap.put(characterFromS, characterFromT);
            } else if (!targetCharacter.equals(characterFromT)) {
                return false;
            }
        }
        return true;
    }

}
