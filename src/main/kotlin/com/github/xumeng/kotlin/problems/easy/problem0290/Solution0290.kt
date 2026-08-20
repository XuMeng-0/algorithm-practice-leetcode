package com.github.xumeng.kotlin.problems.easy.problem0290

class Solution0290 {

    fun wordPattern(pattern: String, s: String): Boolean {
        val stringElements: List<String> = s.split(" ")
        val patternElements: MutableList<String> = mutableListOf()
        for (i in pattern.indices) {
            patternElements.add(pattern[i].toString())
        }
        if (stringElements.size != patternElements.size) {
            return false
        }
        val map: MutableMap<String, String> = mutableMapOf()
        val mapValueElement: MutableList<String> = mutableListOf()
        for (i in patternElements.indices) {
            val patternElement = patternElements[i]
            val stringElement = stringElements[i]
            val target: String? = map[patternElement]
            if (target == null) {
                if (mapValueElement.contains(stringElement)) {
                    return false
                } else {
                    map[patternElement] = stringElement
                    mapValueElement.add(stringElement)
                }
            } else {
                if (target == stringElement) {
                    continue
                } else {
                    return false
                }
            }
        }
        return true
    }

}