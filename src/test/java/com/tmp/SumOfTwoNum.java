package com.tmp;

import java.util.Scanner;

public class SumOfTwoNum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = 0, b = 0, c = 0;
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();
    int target = sum(c);
    int min = Integer.MAX_VALUE;
    int index = a;
    if (a > b) {
      int tmp = a;
      a = b;
      b = tmp;
    }

    for (int i = a; i <= b; i++) {
      int source = sum(i);
      if (Math.abs(target - source) < min) {
        index = i;
        min = Math.abs(target - source);
      }
    }

    System.out.println(index);
  }

  private static int sum(int origin) {
    int result = 0;
    while (origin > 0) {
      result += origin % 10;
      origin = origin / 10;
    }
    return result;
  }
}