package com.common;

import java.util.Arrays;

/**
 * 两数之和
 */
public class TwoNumberSumEqual {

    public static void main(String[] args) {
//        int[] nums = {4, 3, 2, 1, 7, 8, 5, 6};
        int[] nums = {3,2,4};
//        int[] quickSortNums = quickSort3(nums, 0, nums.length - 1);

//        int[] result = getSumIndex(quickSortNums, 6);
        Arrays.sort(nums);
        for (int item : nums) {
            System.out.println(item);
        }
    }

    private static int[] getSumIndex(int[] nums, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if(sum == target){
                result[0] = start;
                result[1] = end;
                break;
            } else if(sum > target){
                end --;
            } else {
                start ++;
            }
        }
        return result;
    }

    private static int[] quickSort3(int[] nums, int left, int right) {
        if (left >= right) {
            return nums;
        }

        int partition = right + 1;
        int flag = nums[left];
        for (int i = right; i >= left; i--) {
            if (nums[i] > flag) {
                partition--;
                swap(nums, partition, i);
            }
        }
        partition--;
        swap(nums, partition, left);
        quickSort3(nums, left, partition - 1);
        quickSort3(nums, partition + 1, right);
        return nums;
    }



    private static int[] swap(int[] nums, int idx1, int idx2) {
        int tmp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = tmp;
        return nums;
    }

    private static int[] quickSort(int[] nums, int start, int end) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        if (start >= end) {
            return nums;
        }
        int standardIdx = start;
        int standard = nums[start];
        int startIdx = start + 1;
        Integer startNum = null;
        int endIdx = end;
        Integer endNum = null;

        while (startIdx < endIdx) {
            for (int i = startIdx; i <= endIdx; i++) {
                if (nums[i] > standard) {
                    startIdx = i;
                    startNum = nums[i];
                    break;
                }
            }
            for (int j = endIdx; j >= startIdx; j--) {
                if (nums[j] < standard) {
                    endIdx = j;
                    endNum = nums[j];
                    break;
                }
            }

            if (startNum != null && endNum != null) {
                nums[endIdx] = startNum;
                nums[startIdx] = endNum;
                startNum = null;
                endNum = null;
            }
        }
        for (int i = start + 1; i <= end; i++) {
            int cur = nums[i];
            if (cur <= standard) {
                nums[standardIdx] = cur;
                standardIdx = i;
            }
        }
        nums[standardIdx] = standard;
        quickSort(nums, start, standardIdx - 1);
        quickSort(nums, standardIdx + 1, end);
        return nums;
    }
}
