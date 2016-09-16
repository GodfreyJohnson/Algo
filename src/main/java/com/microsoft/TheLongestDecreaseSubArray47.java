package com.microsoft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheLongestDecreaseSubArray47 {
  public int[] solution(int[] array) {
    if (array.length <= 0) {
      return array;
    }

    int count = 0, index = 0, max = 0, i = 1;
    while (i < array.length) {
      if (array[i] < array[i - 1]) {
        count++;
        if (count > max) {
          max = count;
          index = i;
        }
      } else {
        count = 0;
      }
      i++;
    }

    max++;
    int[] result = new int[max];
    for (int k = index; k > index - max; k--) {
      result[k + max - index - 1] = array[k];
    }
    return result;
  }


}
