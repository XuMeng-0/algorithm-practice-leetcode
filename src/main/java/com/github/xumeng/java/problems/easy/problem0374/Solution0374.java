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
        long min = 1;
        long max = n;
        int middle;
        int lastMiddle = 0;
        int result;
        do {
            middle = (int) ((min + max) / 2);
            result = guess(middle);
            if (result < 0) {
                max = middle;
            }
            if (result > 0) {
                min = middle;
            }
            if (result == 0) {
                return middle;
            }
            if (lastMiddle == middle) {
                break;
            }
            lastMiddle = middle;
        } while (min < max);
        return (int) max;
    }
}
