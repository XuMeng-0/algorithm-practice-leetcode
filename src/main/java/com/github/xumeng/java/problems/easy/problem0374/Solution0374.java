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
        do {
            middle = min + (max - min) / 2;
            result = guess(middle);
            if (result == 0) {
                return middle;
            }
            if (result < 0) {
                max = middle - 1;
            }
            if (result > 0) {
                min = middle + 1;
            }
        } while (min < max);
        return max;
    }
}
