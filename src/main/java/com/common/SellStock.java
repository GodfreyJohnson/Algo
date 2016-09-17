package com.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SellStock {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    String[] array = input.split(",");

    try {
      for (String str : array) {
        int value = Integer.parseInt(str);
        list.add(value);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    SellStock ss = new SellStock();
    ss.solution(list);

  }

  private void solution(List<Integer> list) {
    if (list == null || list.size() <= 0)
      return;

    int min = list.get(0), maxProfit = 0;
    for (int num : list) {
      if (num < min) {
        min = num;
      } else {
        maxProfit = num - min > maxProfit ? (num - min) : maxProfit;
      }
    }
    System.out.println(maxProfit);
  }
}
