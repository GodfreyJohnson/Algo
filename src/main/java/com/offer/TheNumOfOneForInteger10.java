package com.offer;

public class TheNumOfOneForInteger10 {
  /**
   * can not deal with the negative number
   *
   * @param i
   * @return
   */
  public int solution(int i) {
    int count = 0;
    boolean flag = false;
    while (i != 0) {
      if ((i & 1) == 1) {
        count++;
      }
      i = i >> 1;
    }
    return flag ? count + 1 : count;
  }

  /**
   * can deal with the negative number
   *
   * @param i
   * @return
   */
  public int solution2(int i) {
    int count = 0;
    int flag = 1;
    while (flag > 0) {
      if ((i & flag) > 0) {
        count++;
      }
      flag = flag << 1;
    }
    return count;
  }

  public int solution3(int i) {
    int count = 0;
    while (i != 0) {
      ++count;
      i = i & (i - 1);
    }
    return count;
  }
}
