package com.common;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xv2kgi/
 */
public class MaxNoRepeatSubString {
    public static void main(String[] args) {
        MaxNoRepeatSubString a = new MaxNoRepeatSubString();
        System.out.println(a.process2("dvdf"));
    }

    private int process2(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        int len = s.length();
        char[] c = s.toCharArray();
        int[] dp = new int[len];
        dp[0] = 1;
        int max = 1;
        for (int i = 1; i < len; i++) {
            dp[i] = dp[i - 1] + 1;
            int index = i - dp[i - 1];
            while (index < i) {
                if (c[i] == c[index]) {
                    dp[i] = i - index;
                    break;
                }
                index++;
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    private int process(String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int max = 1;
        int end = 1;
        char[] chars = str.toCharArray();
        List<Character> list = new ArrayList<>();
        list.add(chars[0]);
        while (end < chars.length) {
            if (!list.contains(chars[end])) {
                list.add(chars[end]);
            } else {
                int index = list.indexOf(chars[end]);
                List<Character> tmp = new ArrayList<>();
                for (int i = index + 1; i < list.size(); i++) {
                    tmp.add(list.get(i));
                }
                tmp.add(chars[end]);
                list = tmp;
            }
            if (list.size() > max) {
                max = list.size();
            }
            end += 1;
        }
        return max;
    }

}
