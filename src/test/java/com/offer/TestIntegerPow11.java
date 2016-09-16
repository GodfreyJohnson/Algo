package com.offer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestIntegerPow11 {
  IntegerPow11 tp;

  @Before
  public void before() {
    tp = new IntegerPow11();
  }

  @Test
  public void runTest() {
    Assert.assertEquals(tp.solution(3, 2), 9, 0.0);
  }

  @Test
  public void runTest2() {
    Assert.assertEquals(tp.solution(2, -2), 0.25, 0.0);
  }

  @Test
  public void runTest3() {
    Assert.assertEquals(tp.solution(0, 0), 0.0, 0.0);
  }
  @Test
  public void runTest4() {
    Assert.assertEquals(tp.solution(5, 0), 1.0, 0.0);
  }
}
