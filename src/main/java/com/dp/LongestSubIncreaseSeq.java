package com.dp;

/**
 * https://leetcode-cn.com/problems/longest-increasing-subsequence/
 */
public class LongestSubIncreaseSeq {
    public static void main(String[] args) {
        LongestSubIncreaseSeq seq = new LongestSubIncreaseSeq();
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] nums2 = {7,7,7,7,7,7,7};
        int[] nums3 = {0,1,0,3,2,3};
        int result = seq.process(nums);
        int result2 = seq.process(nums2);
        int result3 = seq.process(nums3);
        System.out.println("result: " + result);
        System.out.println("result: " + result2);
        System.out.println("result: " + result3);
    }

    private int process(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int result = 1;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int max = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[j] >= max) {
                    max = dp[j] + 1;
                }
            }
            dp[i] = max;
        }

        for (int item : dp) {
            if (item > result) {
                result = item;
            }
        }
        return result;
    }
}
