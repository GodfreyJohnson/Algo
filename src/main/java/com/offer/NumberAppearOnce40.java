package com.offer;

import com.Utils.PrintUtil;

/**
 * Created by godfrey on 16-9-25.
 */
public class NumberAppearOnce40 {
  public int[] solution(int[] arr) {
    if (arr == null || arr.length <= 0)
      return arr;

    int[] result = new int[2];

    int XOR = 0;
    for (int num : arr) {
      XOR ^= num;
    }

    int bitIndex = getFirstBitForOne(XOR);
    int arr1 = 0;
    int arr2 = 0;

    for (int i = 0; i < arr.length; i++) {
      int num = arr[i];
      if (isOne(num, bitIndex)) {
        arr1 ^= num;
      } else {
        arr2 ^= num;
      }
    }

    result[0] = arr1;
    result[1] = arr2;

    PrintUtil.printIntArray(result);
    return result;
  }

  private boolean isOne(int num, int bitIndex) {
    num = num >> bitIndex;
    return (num & 1) == 1;
  }

  private int getFirstBitForOne(int num) {
    int count = 0;
    while ((num & 1) == 0) {
      count++;
      num = num >> 1;
    }
    return count;
  }

  private int[] findTwoNum(int[] arr, int start, int stop) {
    if (start > stop)
      return null;

    int[] result = new int[2];
    int mid = (start + stop) / 2;
    int begin = start, end = stop;

    int left = arr[begin];
    begin++;
    while (begin <= mid) {
      left ^= arr[begin];
      begin++;
    }

    int right = arr[end];
    while (mid + 1 < end) {
      end--;
      right ^= arr[end];
    }

    if (left != 0 && right != 0) {
      result[0] = left;
      result[1] = right;
    } else if (left != 0) {
      result = findTwoNum(arr, start, mid);
    } else if (right != 0) {
      result = findTwoNum(arr, mid + 1, end);
    } else {
      result = null;
    }
    return result;
  }
}
