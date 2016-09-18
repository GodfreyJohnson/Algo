package com.offer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestOddAndEvenSort14 {
  OddAndEvenSort14 oae;

  @Before
  public void before() {
    oae = new OddAndEvenSort14();
  }

  @Test
  public void run() {
    int[] array = {1, 2, 3, 4, 5, 6};
    int[] result = {1, 5, 3, 4, 2, 6};
    Assert.assertArrayEquals(oae.solution(array), result);
  }

  @Test
  public void run2() {
    int[] array = {1, 2, 3, 4, -5, 6};
    int[] result = {1, -5, 3, 4, 2, 6};
    Assert.assertArrayEquals(oae.solution(array), result);
  }

  @Test
  public void run3() {
    int[] array = {1};
    int[] result = {1};
    Assert.assertArrayEquals(oae.solution(array), result);
  }
}
