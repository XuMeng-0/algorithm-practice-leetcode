package com.github.xumeng.java.problems.easy.problem0225;

import java.util.concurrent.ConcurrentLinkedQueue;

public class MyStack0225 {

    private ConcurrentLinkedQueue<Integer> queue1 = new ConcurrentLinkedQueue<>();
    private ConcurrentLinkedQueue<Integer> queue2 = new ConcurrentLinkedQueue<>();

    public MyStack0225() {

    }

    public void push(int x) {
        queue1.offer(x);
    }

    public int pop() {
        while (!queue1.isEmpty()) {
            Integer element = queue1.poll();
            if (queue1.isEmpty()) {
                ConcurrentLinkedQueue<Integer> queue = queue2;
                queue2 = queue1;
                queue1 = queue;
                return element;
            }
            queue2.offer(element);
        }
        return -1;
    }

    public int top() {
        while (!queue1.isEmpty()) {
            Integer element = queue1.poll();
            queue2.offer(element);
            if (queue1.isEmpty()) {
                ConcurrentLinkedQueue<Integer> queue = queue2;
                queue2 = queue1;
                queue1 = queue;
                return element;
            }
        }
        return -1;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

}
