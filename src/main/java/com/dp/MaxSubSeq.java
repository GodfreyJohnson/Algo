package com.dp;



/**
 * 给定两个字符串 text1 和 text2，返回这两个字符串的最长 公共子序列 的长度。如果不存在 公共子序列 ，返回 0 。
 * 输入：text1 = "abcde", text2 = "ace"
 * 输出：3
 *
 * @author： godfrey
 */
public class MaxSubSeq {
    public static void main(String[] args) {
        MaxSubSeq subSeq = new MaxSubSeq();
        System.out.println(subSeq.getMaxSubSeq("abcde", "ace"));
    }

    private int getMaxSubSeq(String text1, String text2) {
        if (text1 == null || text2 == null){
            return 0;
        }

        Integer[][] array = new Integer[text1.length()][text2.length()];
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                array[i][j] = 0;
                char a = text1.charAt(i);
                char b = text1.charAt(j);

                if (a == b) {
                    if (i - 1 < 0 || j - 1 < 0) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = array[i - 1][j - 1] + 1;
                    }
                } else {
                    if (i - 1 < 0 || j - 1 < 0) {
                        array[i][j] = 0;
                    } else {
                        array[i][j] = Math.max(array[i - 1][j], array[i][j - 1]);
                    }
                }
            }
        }

        return array[text1.length() - 1][text2.length() - 1];
    }
}
