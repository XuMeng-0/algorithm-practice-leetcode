package com.github.xumeng.kotlin.problems.easy.problem0345

class Solution0345 {

    fun reverseVowels(s: String): String {
        val characters = s.toCharArray()
        var temp: Char
        var i = 0
        var j = characters.size - 1
        while (i < j) {
            if (isNotVowel(characters[i])) {
                i++
                continue
            }
            if (isNotVowel(characters[j])) {
                j--
                continue
            }
            temp = characters[i]
            characters[i] = characters[j]
            characters[j] = temp
            i++
            j--
        }
        return String(characters)
    }

    private fun isNotVowel(character: Char): Boolean {
        return when (character) {
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> false
            else -> true
        }
    }

}