package com.dp;

/**
 * https://leetcode-cn.com/problems/partition-equal-subset-sum/
 * 数组能否分成相等的两部分，为0-1背包问题
 */
class CanPartition {
    public static void main(String[] args) {
        CanPartition cp = new CanPartition();
        int[] nums = {2, 2, 3, 5};
        boolean result = cp.canPartition(nums);
        System.out.println(result);
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int item : nums) {
            sum += item;
        }

        if ((sum & 1) == 1) {
            return false;
        }

        int target = sum / 2;
        boolean[][] matrix = new boolean[nums.length][target + 1];
//        matrix[0][0] = true;
        if (nums[0] <= target) {
            matrix[0][nums[0]] = true;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j <= target; j++) {
                if (j - nums[i] >= 0) {
                    matrix[i][j] = matrix[i - 1][j] || matrix[i-1][j - nums[i]];
                } else {
                    matrix[i][j] = matrix[i - 1][j];
                }
                if (matrix[i][target]) {
                    return true;
                }
            }
        }
        return matrix[nums.length - 1][target];
    }
}