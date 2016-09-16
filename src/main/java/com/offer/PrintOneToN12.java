package com.offer;

import java.math.BigInteger;

/**
 * the range of input number
 * the result of  the generated number may overflow with integer and long,
 * so we use biginteger
 */
public class PrintOneToN12 {
  public static void main(String[] args){
    PrintOneToN12 print = new PrintOneToN12();
    print.solution(10000);
  }
  public int[] solution(int num) {
    if (num <= 0)
      return null;

    BigInteger bi = new BigInteger(String.valueOf(9));

    if(num >= 2) {
      for (int i = 2; i <= num; i++) {
        bi = bi.multiply(new BigInteger(String.valueOf(10))).add(new BigInteger(String.valueOf(9)));
      }
    }


    for (BigInteger start = new BigInteger(String.valueOf(1)); start.compareTo(bi) == -1 || start.compareTo(bi) == 0;
         start = start.add(new BigInteger(String.valueOf(1)))) {
      System.out.println(start);
    }

    return null;
  }
}
