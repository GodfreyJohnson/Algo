package com.offer;

import com.Utils.PrintUtil;

public class ContinueSeqWithSum41_2 {
  public void solution(int target) {
    if (target < 3) {
      return;
    }

    int begin = 1, end = 2;
    int mid = (target + begin) / 2;
    int sum = begin + end;
    while (begin < mid && end <= mid + 1) {
      if (sum == target) {
        PrintUtil.printInRange(begin, end);
      }

      while (sum > target && begin < mid) {
        sum -= begin;
        begin++;

        if (sum == target) {
          PrintUtil.printInRange(begin, end);
        }
      }

      end++;
      sum += end;
    }
  }
}
