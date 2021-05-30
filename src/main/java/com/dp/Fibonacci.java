package com.dp;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.print(fibonacci.calculate(5));
    }

    public Integer calculate(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0 || n == 1) {
            return 1;
        }

        int a = 1;
        int b = 1;
        int current;
        for (int i = 2; i <= n; i++) {
            current = a + b;
            a = b;
            b = current;
        }
        return b;
    }
}
