package com.greedy;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/jump-game-ii/
 */
public class JumpGame {
    public static void main(String[] args) {
        JumpGame game = new JumpGame();
        int[] nums = {2, 3, 1, 1, 4};
        int result = game.process(nums);
        System.out.println(result);
    }

    private int process(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int index = nums.length - 1;
        int result = 0;
        while (index > 0) {
            for (int i = 0; i < index; i++) {
                if (nums[i] + i >= index) {
                    result += 1;
                    index = i;
                    break;
                }
            }
        }
        return result;
    }
}
