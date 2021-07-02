package com.common;

import com.google.common.base.Strings;

/**
 * 输出数组所有的组合
 */
public class Zuhe {
    public static void main(String[] args) {
        Zuhe zuhe = new Zuhe();
        String text = "abcde";
        zuhe.process(text);
    }

    private void process(String text) {
        if (Strings.isNullOrEmpty(text)) {
            return;
        }

        zuhe(text.toCharArray(), new StringBuilder(), 0);
    }

    private void zuhe(char[] array, StringBuilder sb, int index) {
        for (int i = index; i < array.length; i++) {
            sb.append(array[i]);
            System.out.println(sb);

            if (i <= array.length - 1) {
                zuhe(array, sb, i + 1);
            }
            sb.setLength(sb.length() - 1);
        }
    }
}
