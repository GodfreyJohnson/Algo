package com.offer;

public class MinNumberInRotatedArray8 {
  public int solution(int[] arr) {
    if (arr == null || arr.length <= 0) {
      return 0;
    }
    int len = arr.length;

    int start = 0, end = len - 1;
    int mid = start;
    while (arr[start] >= arr[end]) {
      mid = (start + end) / 2;

      if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
        return findInOrder(arr, start, end);
      }

      if(arr[mid] <= arr[start])
        end = mid;
      else {
        start = mid;
      }
    }
    return arr[mid];
  }

  private int findInOrder(int[] arr, int start, int end) {
    int res = arr[start];
    if (start <= end) {
      for (int num : arr) {
        if (num <= res) {
          res = num;
        }
      }
    }
    return res;
  }
}
