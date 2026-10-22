package com.github.xumeng.kotlin.problems.medium.problem0071

class Solution0071 {

    fun simplifyPath(path: String): String {
        var canonicalPath = path.replace("//", "/")
        if (canonicalPath.length > 1) {
            canonicalPath = canonicalPath.removeSuffix("/")
        }
        val directories = canonicalPath.split("/").toMutableList()
        removePointDirectory(directories)
        removeDoublePointDirectory(directories)
        if (directories.isEmpty()) {
            directories.add("/")
        }
        canonicalPath = directories.joinToString("/")
        if (!canonicalPath.startsWith("/")) {
            canonicalPath = "/$canonicalPath"
        }
        return canonicalPath
    }

    private fun removePointDirectory(directories: MutableList<String>) {
        var i = directories.size - 1
        while (i >= 0 && directories.isNotEmpty()) {
            val directory = directories[i]
            if (directory == ".") {
                directories.removeAt(i)
            }
            i--
        }
    }

    private fun removeDoublePointDirectory(directories: MutableList<String>) {
        var i = directories.size - 1
        var count = 0
        while (i >= 0 && directories.isNotEmpty()) {
            val directory = directories[i]
            if (directory == "..") {
                directories.removeAt(i)
                count++
            } else if (count > 0) {
                directories.removeAt(i)
                count--
            }
            i--
        }
    }

}