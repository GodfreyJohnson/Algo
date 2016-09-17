package com.offer;

import java.math.BigInteger;

/**
 * the range of input number
 * the result of  the generated number may overflow with integer and long,
 * so we use big integer
 */
public class PrintOneToN12 {
  public static void main(String[] args) {
    PrintOneToN12 print = new PrintOneToN12();
//    print.solution(10000);
    print.solution2(100);
  }

  public int[] solution(int num) {
    if (num <= 0)
      return null;

    BigInteger bi = new BigInteger(String.valueOf(9));

    if (num >= 2) {
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

  /**
   * use all sort to print all number in range
   * not in sequence like 1,2,3,4,5
   * @param num
   */
  public void solution2(int num) {
    if (num <= 0)
      return;

    char[] array = new char[num];
    for (int i = 0; i < 10; i++) {
      array[0] = (char) (i + '0');
      printDigitalRec(array, num, 0);
    }
  }

  /**
   * index should be equal to index-1
   * and remember to return after print array
   * @param array
   * @param num
   * @param index
   */
  private void printDigitalRec(char[] array, int num, int index) {
    if (index == num-1) {
      printArray(array);
      return;
    }

    for (int i = 0; i < 10; i++) {
      array[index + 1] = (char) (i + '0');
      printDigitalRec(array, num, index + 1);
    }
  }

  private void printArray(char[] array) {
    if (array == null || array.length <= 0)
      return;

    for (int i = array.length - 1; i >= 0; i--) {
      System.out.print(array[i]);
    }
    System.out.println();
  }
}
