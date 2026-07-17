package com.github.xumeng.kotlin.problems.easy.problem0232

class MyQueue0232 {

    private val stack1: ArrayDeque<Int> = ArrayDeque()
    private val stack2: ArrayDeque<Int> = ArrayDeque()

    fun push(x: Int) {
        stack1.addLast(x)
    }

    fun pop(): Int {
        while (stack1.isNotEmpty()) {
            val element = stack1.removeLast()
            if (stack1.isEmpty()) {
                while (stack2.isNotEmpty()) {
                    stack1.addLast(stack2.removeLast())
                }
                return element
            }
            stack2.addLast(element)
        }
        return 0
    }

    fun peek(): Int {
        while (stack1.isNotEmpty()) {
            val element = stack1.removeLast()
            stack2.addLast(element)
            if (stack1.isEmpty()) {
                while (stack2.isNotEmpty()) {
                    stack1.addLast(stack2.removeLast())
                }
                return element
            }
        }
        return 0
    }

    fun empty(): Boolean {
        return stack1.isEmpty()
    }

}