package com.string;

import java.util.ArrayList;
import java.util.List;

public class String2Array {
    public static void main(String[] args) {
        String2Array util = new String2Array();
        util.toArray1();

    }

    private void toArray1() {
        String text1 = "abcde f";
        char[] chars = text1.toCharArray();
        List<String> list = new ArrayList<>();
        for (char item: chars){
            if(item == ' '){
                list.add("%20");
            } else {
                list.add(String.valueOf(item));
            }
        }
        System.out.println(String.join("", list));
    }
}
