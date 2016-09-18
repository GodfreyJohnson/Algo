package com.tmp;

import java.util.Scanner;

public class GetZeroNumForNMultiple {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.next());
    if(num <= 0)
      return;
    int result = 0;

    for (int i = 1; i <= num; i++) {
      int tmp = i;
      while (tmp % 5 == 0 && tmp != 1) {
        result++;
        tmp = tmp / 5;
      }
    }

    System.out.print(result);
  }
}
