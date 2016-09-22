package com.offer;

import com.Utils.PrintUtil;

/**
 * url: http://blog.csdn.net/johnlee175/article/details/45627667
 */
public class Combination28_1 {
  public void solution(char[] chars) {
    if (chars == null || chars.length == 0)
      return;

    char[] subChars = new char[chars.length];
    for (int i = 0; i < chars.length; i++) {
      combination(chars, chars.length, i + 1, subChars);
    }
  }

  private void combination(char[] chars, int length, int m, char[] subChars) {
    if (m == 0) {
      PrintUtil.printCharArray(subChars);
    } else {
      // leave m-1 element for m-1
      for (int i = length-1; i >= m - 1; i--) {
        subChars[m - 1] = chars[i];
        combination(chars, i, m - 1, subChars);
      }
    }
  }
}
