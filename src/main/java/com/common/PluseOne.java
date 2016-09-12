package com.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PluseOne {
  public static void main(String[] args){
    PluseOne po = new PluseOne();
    int[] arr = {0};
    po.plusOne(arr);
  }

  public int[] plusOne(int[] digits) {
    if(digits.length == 0)
      return digits;

    int origin = 0;
    int len = digits.length;
    for(int i = 0;i < len; i++) {
      origin += Math.pow(2, len - i - 1) * digits[i];
    }

    origin += 1;

    List<Integer> list = new ArrayList<Integer>();
    int tmp = 0;
    while(origin != 0) {
      tmp = origin % 2;
      list.add(tmp);
      origin = origin / 2;
    }

    Collections.reverse(list);

    int[] result = new int[list.size()];
    for(int i = 0; i < list.size(); i++) {
      result[i] = list.get(i);
    }

    return result;
  }

}
