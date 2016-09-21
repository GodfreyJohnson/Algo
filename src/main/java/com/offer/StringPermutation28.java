package com.offer;

import com.Utils.PrintUtil;

import java.util.List;

public class StringPermutation28 {
  public List<String> solution(String str, List<String> list, StringBuilder result) {
    if (str == null || str.isEmpty())
      return null;

    if (result.length() < str.length()) {
      for (int i = 0; i < str.length(); i++) {
        // in case of variable use at the same time
        StringBuilder sb = new StringBuilder(result.toString());
        if (!sb.toString().contains(str.charAt(i) + "")) {
          sb.append(str.charAt(i));
          solution(str, list, sb);
        }
      }
    } else {
      list.add(result.toString());
      return list;
    }
    PrintUtil.printStringArrayList(list);
    return list;
  }
}
