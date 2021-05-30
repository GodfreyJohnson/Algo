package com.dp;

public class CutIron {
    public static void main(String[] args) {
        CutIron cutIron = new CutIron();
        int[] origin = new int[100];
        origin[0] = 1;
        origin[1] = 5;
        origin[2] = 8;
        origin[3] = 9;
        origin[4] = 10;
        origin[5] = 17;
        origin[6] = 17;
        origin[7] = 20;
        origin[8] = 24;
        origin[9] = 30;
        System.out.println(cutIron.recursive(origin, 4));
    }

    private int recursive(int[] origin, int n) {
        int result = Integer.MIN_VALUE;
        for (int i = 1; i <= n - 1; i++) {
            result = Math.max(result, origin[i - 1] + recursive(origin, n-i));
            origin[i] = result;
        }
        return result;
    }
}
