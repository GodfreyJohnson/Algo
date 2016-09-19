package com.offer;

import com.Utils.PrintUtil;

import java.util.ArrayList;
import java.util.List;

public class PrintMatrixWithClockWise {
  static int UP = 1;
  static int RIGHT = 2;
  static int DOWN = 3;
  static int LEFT = 4;

  // code by godfrey
  public List<Integer> solution(int[][] matrix) {
    if (matrix == null)
      return null;
    List<Integer> result = new ArrayList<Integer>();
    greedySnake(matrix, result, 0, matrix.length - 1, 0, matrix[0].length - 1, RIGHT);
    PrintUtil.printArrayList(result);
    return result;
  }

  private void greedySnake(int[][] matrix, List<Integer> result, int startRow, int endRow, int startCol,
                           int endCol, int direction) {
    if (startRow > endRow || startCol > endCol) {
      return;
    }
    switch (direction) {
      case 2:
        int tmp = startCol;
        while (tmp <= endCol) {
          System.out.println(matrix[startRow][tmp]);
          result.add(matrix[startRow][tmp]);
          tmp++;
        }
        greedySnake(matrix, result, startRow + 1, endRow, startCol, endCol, DOWN);
        break;
      case 3:
        int tmp2 = startRow;
        while (tmp2 <= endRow) {
          System.out.println(matrix[tmp2][endCol]);
          result.add(matrix[tmp2][endCol]);
          tmp2++;
        }
        greedySnake(matrix, result, startRow, endRow, startCol, endCol - 1, LEFT);
        break;
      case 4:
        int tmp3 = endCol;
        while (tmp3 >= startCol) {
          System.out.println(matrix[endRow][tmp3]);
          result.add(matrix[endRow][tmp3]);
          tmp3--;
        }
        greedySnake(matrix, result, startRow, endRow - 1, startCol, endCol, UP);
        break;
      case 1:
        int tmp4 = endRow;
        while (tmp4 >= startRow) {
          System.out.println(matrix[tmp4][startCol]);
          result.add(matrix[tmp4][startCol]);
          tmp4--;
        }
        greedySnake(matrix, result, startRow, endRow, startCol + 1, endCol, RIGHT);
        break;
    }
  }
}
