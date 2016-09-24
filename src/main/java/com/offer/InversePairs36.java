package com.offer;

public class InversePairs36 {
  public int solution(int[] array) {
    if (array == null || array.length <= 0)
      return 0;

    return sort(array, 0, array.length - 1);
  }

  private int sort(int[] array, int start, int end) {
    int count = 0;
    if (start >= 0 && end <= array.length - 1 && start < end) {
      int mid = (start + end) / 2;
      count += sort(array, start, mid);
      count += sort(array, mid + 1, end);
      count += merge(array, start, mid, end);
    }
    return count;
  }

  private int merge(int[] array, int start, int mid, int end) {
    int count = 0;
    while (start <= mid || end > mid) {

    }
    return count;
  }
}
