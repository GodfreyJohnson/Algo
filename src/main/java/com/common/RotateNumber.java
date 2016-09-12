package com.common;

import java.util.Stack;

class RotateNumber {
  public static void main(String[] args) {
    int[] arr = {1, 2};
    RotateNumber rn = new RotateNumber();
    rn.rotate(arr, 3);
  }

  public void rotate(int[] nums, int k) {
    if (nums.length <= 0 || k <= 0)
      return;
    Stack<Integer> q = new Stack<Integer>();
    if(k >= nums.length){
      for(int i = 0;i<nums.length;i++){
        q.push(nums[i]);
      }
    }else {
      for (int i = nums.length - 1 - k; i >= 0; i--) {
        q.add(nums[i]);
      }
      for (int j = nums.length - 1; j > (nums.length - 1 - k >= 0 ? nums.length - 1 - k : 0); j--) {
        q.add(nums[j]);
      }
    }


    for (int i = 0; i < nums.length; i++) {
      nums[i] = q.pop();
      System.out.println(nums[i]);
    }
  }
}
