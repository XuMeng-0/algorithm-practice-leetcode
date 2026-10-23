package com.github.xumeng.java.problems.easy.problem0374;

public class Solution0374 {

    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    private int guess(int num) {
        return Integer.compare(this.number, num);
    }

    public int guessNumber(int n) {
        return n;
    }

}
