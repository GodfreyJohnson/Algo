package com.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int target = Integer.parseInt(sc.next());
    int n = Integer.parseInt(sc.next());
    int count = n;
    List<Integer> list = new ArrayList<Integer>();
    try {
      while (n > 0) {
        list.add(Integer.parseInt(sc.next()));
        n--;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    if (count != list.size()) {
      System.out.println("Illegal input");
      return;
    }

    BinarySearch bs = new BinarySearch();
    bs.solution(list, target);
  }

  private void solution(List<Integer> list, int target) {
    if (list == null || list.size() <= 0) {
      return;
    }

    int low = 0;
    int high = list.size() - 1;
    boolean find = false;

    while (low <= high) {
      int mid = (low + high) / 2;
      if (target == list.get(mid)) {
        System.out.println(mid);
        find = true;
        break;
      } else if (target > list.get(mid)) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    if (!find)
      System.out.println(-1 - low);
    return;
  }
}
