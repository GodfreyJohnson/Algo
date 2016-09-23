package com.offer;

public class GreatestSumOfSubArrays_30 {
  public int solution(int[] array) {
    if (array == null || array.length <= 0)
      return 0;

    int max = 0;
    int[] sum = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      int tmp;
      if (i == 0) {
        max = array[i];
        tmp = array[i];
      } else {
        tmp = sum[i - 1] + array[i];
        if (tmp < 0) {
          tmp = 0;
        } else if (tmp > max) {
          max = tmp;
        }
      }
      sum[i] = tmp;
    }
    return max;
  }
}
