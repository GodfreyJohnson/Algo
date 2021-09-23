package com.greedy;

import org.junit.Assert;

import java.util.Arrays;
import java.util.Stack;

public class CoinChange {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        CoinChange cc = new CoinChange();
        int[] nums = {186,419,83,408};
        int result = cc.coinChangeDP(nums, 6249);
        System.out.println(result);
//        Assert.assertEquals(result, -1);
    }

    public int coinChangeDP(int[] coins, int amount){
        int[] dp = new int[amount+1];
        dp[0]=0;
        for(int i = 1;i<=amount;i++){
            int value = i;
            dp[i] = Arrays.stream(coins).filter(coin -> coin <= value)
                    .map(coin -> dp[value-coin]+1)
                    .min()
                    .orElse(amount+1);
        }
        return dp[amount] > amount?-1:dp[amount];
    }

    //贪心算法，并不一定能求出解
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length <= 0 || amount <= 0) {
            return 0;
        }
        Arrays.sort(coins);
        int sum = 0;
        int multiple = 0;
        int index = coins.length - 1;
        while (amount > 0) {
            multiple = amount / coins[index];
            amount = amount - multiple * coins[index];
            System.out.println(amount);
            sum += multiple;
            index--;
            if (amount > 0 && index < 0) {
                return -1;
            }
        }
        return sum;
    }
}
