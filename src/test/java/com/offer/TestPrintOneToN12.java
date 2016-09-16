package com.offer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPrintOneToN12 {
  private  PrintOneToN12 print;

  @Before
  public void before(){
    print = new PrintOneToN12();
  }

  @Test
  public void runTest(){
    Assert.assertArrayEquals(print.solution(5), null);
  }
}
