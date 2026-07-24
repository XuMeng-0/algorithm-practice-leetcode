package com.github.xumeng.kotlin.problems.easy.problem0242

class Solution0242 {

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val characterOfS: Map<Char, Int> = countCharacters(s)
        val characterOfT: Map<Char, Int> = countCharacters(t)
        val size1: Int = characterOfS.size
        val size2: Int = characterOfT.size
        if (size1 != size2) {
            return false
        }
        val characters: Set<Char> = characterOfS.keys
        characters.forEach { character ->
            val countS = characterOfS[character]
            val countT = characterOfT[character]
            if (countS != countT) {
                return false
            }
        }
        return true
    }

    private fun countCharacters(str: String): Map<Char, Int> {
        val charactersMap: MutableMap<Char, Int> = mutableMapOf()
        val length = str.length
        var i = 0
        while (i < length) {
            val character = str[i]
            var count: Int? = charactersMap[character]
            if (count != null) {
                count++
            } else {
                count = 1
            }
            charactersMap[character] = count
            i++
        }
        return charactersMap
    }

}