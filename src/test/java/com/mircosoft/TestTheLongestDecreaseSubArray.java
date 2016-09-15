package com.mircosoft;

import com.microsoft.TheLongestDecreaseSubArray47;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTheLongestDecreaseSubArray {
  private TheLongestDecreaseSubArray47 ld;

  @Before
  public void before() {
    ld = new TheLongestDecreaseSubArray47();
  }

  @Test
  public void runTest() {
    int[] tmp = {9, 8, 7, 5, 4, 6, 7};
    int[] result = {9, 8, 7, 5, 4};
    Assert.assertArrayEquals(ld.solution(tmp), result);
  }
}
