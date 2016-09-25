package com.offer;

/**
 * Created by godfrey on 16-9-25.
 */

public class NumberOfK38 {
  public int solution(int[] array, int target) {
    if (array == null || array.length <= 0 || target < array[0] || target > array[array.length - 1])
      return 0;

    return half(array, 0, array.length - 1, target);
  }

  private int half(int[] array, int start, int end, int target) {
    if (start > end)
      return 0;

    int mid = (start + end) / 2;
    int count = 0;
    if (target == array[mid]) {
      int tmp = mid;
      while (tmp >= 0 && array[tmp] == target) {
        count++;
        tmp--;
      }

      tmp = mid + 1;
      while (tmp <= array.length - 1 && array[tmp] == target) {
        count++;
        tmp++;
      }
    } else if (target < array[mid]) {
      count += half(array, start, mid - 1, target);
    } else if (target > array[mid]) {
      count += half(array, mid + 1, end, target);
    }
    return count;
  }
}
