package com.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveElementForArray {
  public static void main(String[] args) {
    RemoveElementForArray re = new RemoveElementForArray();
    re.removeElement(new int[]{3, 2, 3, 2}, 3);
  }
  public int removeElement(int[] nums, int val) {
    if(nums.length <= 0)
      return 0;

    List<Integer> list = new ArrayList<Integer>();

    for(int i = 0;i < nums.length; i++) {
      list.add(nums[i]);
    }

    for(int i = 0;i < list.size(); i++) {
      if(list.get(i) == val) {
        list.remove(i);
      }
    }

    int[] result = new int[list.size()];
    for(int j = 0;j < list.size(); j++){
      result[j] = list.get(j);
    }

    nums = result;

    return nums.length;
  }
}
