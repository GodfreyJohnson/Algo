package com.tmp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrogEscape {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = Integer.parseInt(sc.next());
    int col = Integer.parseInt(sc.next());
    int power = Integer.parseInt(sc.next());
    if (row <= 0 || col <= 0 || power <= 0) {
      System.out.println("Can note escape!");
      return;
    }

    int count = 0;
    int[][] map = new int[row][col];
    while (count < row) {
      for (int i = 0; i < col; i++) {
          map[count][i] = Integer.parseInt(sc.next());
      }
    }

    List<String> list = new ArrayList<String>();
    list.add("0,0");
    findShortPath(power, 0, 0, row, col - 1, list, map);
  }

  private static int findShortPath(int power, int startRow, int startCol, int row, int col, List<String>
      list, int[][] map) {
    if (power <= 0 && startRow != 0 && startCol != col - 1) {
      System.out.println("Can note escape!");
      return 0;
    }

    int count = 0, result1 = 0, result2 = 0, result3 = 0, result4 = 0;
    if(startCol == col-1 && startRow == 0){
      count = 1;
    }
    // up
    if (startRow - 1 >= 0 && startRow + 1 <= row - 1 && startCol >= 0 && startCol <= col - 1
        && map[startRow - 1][startCol] == 1 && !list.contains((startRow - 1) + "," + startCol)) {
      result1 = findShortPath(power - 3, startRow - 1, startCol, row, col, list, map);
    }

    // bottom
    if (startRow + 1 <= row - 1 && startRow + 1 <= row - 1 && startCol >= 0 && startCol <= col - 1 && map[startRow +
        1][startCol] == 1 && !list.contains((startRow + 1) + "," + startCol)) {
      result2 = findShortPath(power, startRow + 1, startCol, row, col, list, map);
    }

    // left
    if (startRow >= 0 && startRow <= row - 1 && startCol - 1 >= 0 && startCol - 1 <= col - 1
        && map[startRow][startCol - 1] == 1 && !list.contains(startRow + "," + (startCol - 1))) {
      result3 = findShortPath(power - 1, startRow, startCol - 1, row, col, list, map);
    }

    // right
    if (startRow >= 0 && startRow <= row - 1 && startCol + 1 >= 0 && startCol + 1 <= col - 1
        && map[startRow][startCol + 1] == 1 && !list.contains(startRow + "," + (startCol + 1))) {
      result4 = findShortPath(power - 1, startRow, startCol + 1, row, col, list, map);
    }

    if(result1 > 0 && result1 <= result2 && result1 <= result3 && result1 <= result4){
      list.add(startRow - 1 + "," + startCol);
      count += result1;
    }
    if(result2 > 0 && result2 <= result1 && result2 <= result3 && result1 <= result4){
      list.add(startRow + 1 + "," + startCol);
      count += result2;
    }
    if(result3 > 0 && result3 <= result1 && result3 <= result2 && result1 <= result4){
      list.add(startRow + "," + (startCol - 1));
      count += result3;
    }
    if(result4 > 0 && result4 <= result1 && result4 <= result2 && result1 <= result3){
      list.add(startRow + "," + (startCol + 1));
      count += result4;
    }

    return count;
  }
}
