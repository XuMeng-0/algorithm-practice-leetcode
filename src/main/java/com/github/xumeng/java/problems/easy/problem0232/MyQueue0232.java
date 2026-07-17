package com.github.xumeng.java.problems.easy.problem0232;

import java.util.Stack;

public class MyQueue0232 {

    private final Stack<Integer> stack1 = new Stack<>();
    private final Stack<Integer> stack2 = new Stack<>();

    public MyQueue0232() {

    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            Integer element = stack1.pop();
            if (stack1.isEmpty()) {
                while (!stack2.isEmpty()) {
                    stack1.push(stack2.pop());
                }
                return element;
            }
            stack2.push(element);
        }
        return 0;
    }

    public int peek() {
        while (!stack1.isEmpty()) {
            Integer element = stack1.pop();
            stack2.push(element);
            if (stack1.isEmpty()) {
                while (!stack2.isEmpty()) {
                    stack1.push(stack2.pop());
                }
                return element;
            }
        }
        return 0;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }

}
