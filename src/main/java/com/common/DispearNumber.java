package com.common;

import java.util.ArrayList;
import java.util.List;

public class DispearNumber {
    public static void main(String[] args) {
        DispearNumber dispearNumber = new DispearNumber();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(dispearNumber.findDisappearedNumbers(nums));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]) - 1;
            nums[num] = -Math.abs(nums[num]);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                result.add(i+1);
            }
        }
        return result;
    }
}
