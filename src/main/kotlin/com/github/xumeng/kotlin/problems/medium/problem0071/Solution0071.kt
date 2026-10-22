package com.github.xumeng.kotlin.problems.medium.problem0071

class Solution0071 {

    fun simplifyPath(path: String): String {
        var canonicalPath = path.replace("//", "/")
        if (canonicalPath.length > 1) {
            canonicalPath = canonicalPath.removeSuffix("/")
        }
        val directories = canonicalPath.split("/").toMutableList()
        var i = directories.size - 1
        while (i >= 0) {
            if (directories.isEmpty()) {
                directories.add("/")
                break
            }
            val directory = directories[i]
            if (directory == ".") {
                directories.removeAt(i)
            }
            if (directory == "..") {
                directories.removeAt(i)
                if (i - 1 >= 0) {
                    directories.removeAt(i - 1)
                }
            }
            i--
        }
        canonicalPath = directories.joinToString("/")
        return canonicalPath
    }

}