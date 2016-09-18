package com.offer;

import com.Utils.PrintUtil;

/**
 * let the odd is in front of the even number
 */
public class OddAndEvenSort14 {
  public int[] solution(int[] array) {
    if (array == null || array.length <= 0)
      return array;

    int low = 0;
    int high = array.length - 1;

    while (low < high) {
      while ((low < high) && (array[high] & 1) == 0) {
        high--;
      }
      while (low < high && (array[low] & 1) != 0) {
        low++;
      }
      int tmp = array[high];
      array[high] = array[low];
      array[low] = tmp;
      high--;
      low++;
    }
    PrintUtil.printIntArray(array);
    return array;
  }
}
