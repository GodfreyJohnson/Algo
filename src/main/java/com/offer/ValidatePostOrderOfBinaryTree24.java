package com.offer;

public class ValidatePostOrderOfBinaryTree24 {
  public boolean solutions(int[] nums) {
    if (nums == null || nums.length <= 0)
      return false;

    return isTree(nums, 0, nums.length - 1);
  }

  private boolean isTree(int[] nums, int start, int end) {
    if (start > end)
      return false;

    if (end == start)
      return true;

    int last = nums[end];

    int index = start;
    while (index < end) {
      if (nums[index] > last)
        break;
      index++;
    }
    int index2 = index;
    while (index2 < end) {
      if (nums[index2] < last) {
        return false;
      }
      index2++;
    }

    boolean flag1 = true, flag2 = true;
    if (index - 1 > start) {
      flag1 = isTree(nums, start, index - 1);
    }

    if (index < end) {
      flag2 = isTree(nums, index, end - 1);
    }

    return flag1 & flag2;
  }
}
