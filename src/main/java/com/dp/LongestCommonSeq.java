package com.dp;

/**
 * 最长公共子序列
 * https://www.huaweicloud.com/articles/f106317cbe669984db219a3a5d876e0b.html
 */
public class LongestCommonSeq {
    public static void main(String[] args) {
        LongestCommonSeq lcs = new LongestCommonSeq();
        String text1 = "23aabcd";
        String text2 = "12abcabcd";

        int length = lcs.process(text1, text2);
        System.out.println("longest common sequence length: " + length);
    }

    private int process(String text1, String text2) {
        if (text1 == null || text1.length() <= 0 || text2 == null || text2.length() <= 0) {
            return 0;
        }
        int result = 0;
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();

        int[][] matrix = new int[arr1.length][arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            matrix[0][i] = 0;
        }
        for (int i = 0; i < arr1.length; i++) {
            matrix[i][0] = 0;
        }

        for (int i = 1; i < arr1.length; i++) {
            for (int j = 1; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    matrix[i][j] = matrix[i-1][j-1] + 1;
                } else {
                    matrix[i][j] = Math.max(matrix[i-1][j],matrix[i][j-1]);
                }

                if(matrix[i][j] > result){
                    result = matrix[i][j];
                }
            }
        }

        return result;
    }
}
