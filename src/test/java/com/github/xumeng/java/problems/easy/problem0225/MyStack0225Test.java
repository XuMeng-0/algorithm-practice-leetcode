package com.github.xumeng.java.problems.easy.problem0225;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStack0225Test {

    @Test
    public void test1() {
        MyStack0225 stack = new MyStack0225();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.top());
        assertEquals(2, stack.pop());
        assertFalse(stack.empty());
    }

}