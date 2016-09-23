package com.tmp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TMP1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String source = in.next();
    if (source == null || source.isEmpty())
      return;
    int length = source.length();
    int result = 0;
    List<String> list = new ArrayList<>();

    for (int i = 0; i < length; i++) {
      for (int j = (length + i) / 2; j > i; j--) {
        String sub = source.substring(i, j);
        if (2 * j - i <= length) {
          String sub2 = source.substring(j, 2 * j - i);
          if (sub.equals(sub2) && !list.contains(sub)) {
            result++;
            list.add(sub);
            if (j - 1 > i) {
              i = j - 1;
            } else {
              i = j;
            }
            break;
          }
        }
      }
    }

    System.out.println(result);
  }
}