package com.common;

public class ShellSort {
  public static <T extends Comparable<? super T>> void shellSort(T[] array, int len) {
    int d = len;
    while (d > 1) {
      d = (d + 1) / 2;
      for (int i = 0; i < len - d; i++) {
        if (array[i + d].compareTo(array[i]) < 0) {
          T temp = array[i + d];
          array[i + d] = array[i];
          array[i] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    Integer[] testArray = {23, 25, 12, 42, 35};
    ShellSort.shellSort(testArray, 5);
    System.out.println("The result is:");
    for (Integer item : testArray) {
      System.out.print(item);
      System.out.print(' ');
    }
  }
}
