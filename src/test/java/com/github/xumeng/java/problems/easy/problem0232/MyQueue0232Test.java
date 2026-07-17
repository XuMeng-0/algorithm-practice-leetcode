package com.github.xumeng.java.problems.easy.problem0232;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueue0232Test {

    @Test
    public void test() {
        MyQueue0232 queue = new MyQueue0232();
        queue.push(1);
        queue.push(2);
        assertEquals(1, queue.peek());
        assertEquals(1, queue.pop());
        assertFalse(queue.empty());
    }

}