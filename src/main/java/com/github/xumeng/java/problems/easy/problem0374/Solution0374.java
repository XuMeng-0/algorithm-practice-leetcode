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
        int min = 1;
        int max = n;
        int middle;
        int result;
        long start = 1;
        long end = n;
        do {
            middle = (int) ((start + end) / 2);
            result = guess(middle);
            if (result < 0) {
                start = min;
                end = middle;
                max = middle;
            }
            if (result > 0) {
                start = middle;
                end = max;
                min = middle;
            }
        } while (result != 0);
        return middle;
    }
}
