package com.github.xumeng.java.problems.easy.problem0290;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution0290 {

    public boolean wordPattern(String pattern, String s) {
        String[] stringElements = s.split(" ");
        String[] patternElements = pattern.split("");
        if (stringElements.length != patternElements.length) {
            return false;
        }
        Map<String, String> map = new HashMap<>();
        List<String> mapValueElements = new ArrayList<>();
        for (int i = 0; i < stringElements.length; i++) {
            String patternElement = patternElements[i];
            String stringElement = stringElements[i];
            String target = map.get(patternElement);
            if (target == null) {
                if (mapValueElements.contains(stringElement)) {
                    return false;
                } else {
                    map.put(patternElement, stringElement);
                    mapValueElements.add(stringElement);
                }
            } else {
                if (!target.equals(stringElement)) {
                    return false;
                }
            }
        }
        return true;
    }

}
