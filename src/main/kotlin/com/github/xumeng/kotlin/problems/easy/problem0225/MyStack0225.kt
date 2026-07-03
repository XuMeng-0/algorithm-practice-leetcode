package com.github.xumeng.kotlin.problems.easy.problem0225

class MyStack0225 {

    private var queue1: ArrayDeque<Int> = ArrayDeque()
    private var queue2: ArrayDeque<Int> = ArrayDeque()

    fun push(x: Int) {
        queue1.add(x)
    }

    fun pop(): Int {
        while (queue1.isNotEmpty()) {
            val element = queue1.removeFirst()
            if (queue1.isEmpty()) {
                val queue = queue2
                queue2 = queue1
                queue1 = queue
                return element
            }
            queue2.add(element)
        }
        return -1
    }

    fun top(): Int {
        while (queue1.isNotEmpty()) {
            val element = queue1.removeFirst()
            queue2.add(element)
            if (queue1.isEmpty()) {
                val queue = queue2
                queue2 = queue1
                queue1 = queue
                return element
            }
        }
        return -1
    }

    fun empty(): Boolean {
        return queue1.isEmpty()
    }

}