package com.common;


/**
 * 输出所有字符串的排列
 */
public class Pailie {
    public static void main(String[] args) {
        Pailie pailie = new Pailie();
        String text = "abcde";
        pailie.process(text);
    }

    private void process(String text) {
        if (text == null) {
            return;
        }

        premutation(text.toCharArray(), 0);
    }

    private void premutation(char[] text, int start) {
        if (start == text.length - 1) {
            System.out.println(text);
            return;
        }

        for (int i = start; i < text.length; i++) {
            char tmp = text[i];
            text[i] = text[start];
            text[start] = tmp;

            premutation(text, start+1);

            tmp = text[i];
            text[i] = text[start];
            text[start] = tmp;
        }
    }
}
