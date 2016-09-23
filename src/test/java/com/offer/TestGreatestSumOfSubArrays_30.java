package com.offer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestGreatestSumOfSubArrays_30 {
  GreatestSumOfSubArrays_30 sum;

  @Before
  public void before() {
    sum = new GreatestSumOfSubArrays_30();
  }

  @Test
  public void run() {
    int[] array = {1, -2, 3, 10, -4, 7, 2, -5};
    Assert.assertEquals(sum.solution(array), 18);
  }

  @Test
  public void run2() {
    int[] array = null;
    Assert.assertEquals(sum.solution(array), 0);
  }

  @Test
  public void run3() {
    int[] array = {-1, -2, -3};
    Assert.assertEquals(sum.solution(array), -1);
  }

  @Test
  public void run4() {
    int[] array = {1, 2, -30, 4, 7, -10, 9};
    Assert.assertEquals(sum.solution(array), 11);
  }
}
