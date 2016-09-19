package com.offer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPrintMatrixWithClockWise {
  PrintMatrixWithClockWise printMatrixWithClockWise;

  @Before
  public void before() {
    printMatrixWithClockWise = new PrintMatrixWithClockWise();
  }

  @Test
  public void run() {
    int[][] tmp = {{1, 2}, {3, 4}};
    List<Integer> result = new ArrayList<Integer>();
    result.add(1);
    result.add(2);
    result.add(4);
    result.add(3);
    Assert.assertEquals(printMatrixWithClockWise.solution(tmp), result);
  }


  @Test
  public void run2() {
    int[][] tmp = {{1, 2, 3, 4}};
    List<Integer> result = new ArrayList<Integer>();
    result.add(1);
    result.add(2);
    result.add(3);
    result.add(4);
    Assert.assertEquals(printMatrixWithClockWise.solution(tmp), result);
  }


  @Test
  public void run3() {
    int[][] tmp = {{1, 2, 3}, {4, 5, 6}};
    List<Integer> result = new ArrayList<Integer>();
    result.add(1);
    result.add(2);
    result.add(3);
    result.add(6);
    result.add(5);
    result.add(4);
    Assert.assertEquals(printMatrixWithClockWise.solution(tmp), result);
  }

  @Test
  public void run4() {
    int[][] tmp = null;
    List<Integer> result = new ArrayList<Integer>();
    result.add(1);
    result.add(2);
    result.add(3);
    result.add(6);
    result.add(5);
    result.add(4);
    Assert.assertEquals(printMatrixWithClockWise.solution(tmp), null);
  }
}
