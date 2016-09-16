package com.offer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMinNumberInRotatedArray8 {
  private MinNumberInRotatedArray8 minNum;

  @Before
  public void before(){
    minNum = new MinNumberInRotatedArray8();
  }

  @Test
  public void runTest(){
    int[] arr = {3,4,5,1,2};
    Assert.assertEquals(minNum.solution(arr), 1);
  }

  @Test
  public void runTest2(){
    int[] arr = {1,0,1,1,1};
    Assert.assertEquals(minNum.solution(arr), 0);
  }
}
