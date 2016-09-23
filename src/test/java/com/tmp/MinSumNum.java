package com.tmp;

import java.util.Scanner;

public class MinSumNum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int source = in.nextInt();
    int target = countOne(source);
    int result = source + 1;
    while (countOne(result) != target && result <= Integer.MAX_VALUE) {
      result++;
    }
    System.out.print(result);
  }

  private static int countOne(int source) {
    int count = 0;
    while ((source & (source - 1)) != 0) {
      source = source & (source - 1);
      count++;
    }
    return count;
  }
}