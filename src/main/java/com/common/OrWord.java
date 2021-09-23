package com.common;

import java.util.*;

/**
 * 通过对字符串排序，有效的解决了难题，通过map降低了时间复杂度
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvaszc/
 */
public class OrWord {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        OrWord orWord = new OrWord();
        System.out.println(orWord.getSameLitter(strs));
    }

    private List<List<String>> getSameLitter(String[] strs) {
        if (strs == null || strs.length <= 0) {
            return null;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            if (!map.containsKey(String.valueOf(chars))) {
                map.put(String.valueOf(chars), new ArrayList<>());
            }
            List<String > list = map.get(String.valueOf(chars));
            list.add(str);
        }
        return new ArrayList<>(map.values());
    }
}
