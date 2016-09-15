package com.common;

public class MergeTwoSortedArray {
  public int[] solution(int[] arr1, int[] arr2) {
    if (arr1.length <= 0)
      return arr2;
    if (arr2.length <= 0)
      return arr1;

    for (int i = arr2.length - 1; i >= 0; i--) {
      for (int j = arr1.length - 1; j >= 0; j--) {
        if (arr1[j] != 0 && arr1[j] < arr2[i]) {
          for (int k = arr1.length - 1; k > j + 1; k--) {
            arr1[k] = arr1[k - 1];
          }
          arr1[j + 1] = arr2[i];
          break;
        }
      }
    }

    return arr1;
  }
}
