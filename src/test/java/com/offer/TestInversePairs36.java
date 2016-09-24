package com.offer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInversePairs36 {
  InversePairs36 pair;

  @Before
  public void before() {
    pair = new InversePairs36();
  }

  @Test
  public void run() {
    int[] array = {7, 5, 6, 4};
    Assert.assertEquals(pair.solution(array), 5);
  }

}
