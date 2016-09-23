package com.offer;

import com.Utils.PrintUtil;

public class FindKSmallNum30 {
  public int[] solution(int[] nums, int k) {
    if (nums == null || nums.length <= 0)
      return nums;
    if (nums.length <= k)
      return nums;

    int[] result = new int[k];
    buildHeap(nums, k);

    for (int i = k; i < nums.length; i++) {
      if (nums[i] < nums[0]) {
        swap(nums, i, 0);
        maxHeap(nums, k, 0);
      }
    }

    for (int j = 0; j < k; j++) {
      result[j] = nums[j];
    }
    PrintUtil.printIntArray(result);
    return result;
  }

  private void buildHeap(int[] nums, int k) {
    for (int i = 0; i < k / 2; i++) {
      maxHeap(nums, k, i);
    }
  }

  private void maxHeap(int[] nums, int k, int index) {
    int left = index * 2 + 1;
    int right = index * 2 + 2;
    int largest = index;

    if (left < k && nums[left] > nums[largest]) {
      largest = left;
    }

    if (right < k && nums[right] > nums[largest]) {
      largest = right;
    }

    if (index != largest) {

      swap(nums, index, largest);

      maxHeap(nums, k, largest);
    }
  }

  private void swap(int[] nums, int index, int largest) {
    int tmp = nums[index];
    nums[index] = nums[largest];
    nums[largest] = tmp;
  }
}
