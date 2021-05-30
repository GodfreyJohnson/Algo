package com.dp;

/**
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * <p>
 * 要求时间复杂度为O(n)。
 */
public class BiggestSubSum {
    public static void main(String[] args) {

        BiggestSubSum biggestSubSum = new BiggestSubSum();
        int[] nums = {1};
        System.out.println(biggestSubSum.dp(nums));
    }

    private int dp(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[0] = nums[0];
            } else {
                if (result[i - 1] + nums[i] > nums[i]) {
                    result[i] = result[i - 1] + nums[i];
                } else {
                    result[i] = nums[i];
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int item : result) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

}
