package com.offer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNumberAppearOnce40 {
  NumberAppearOnce40 num;

  @Before
  public void before() {
    num = new NumberAppearOnce40();
  }

  @Test
  public void run() {
    int[] arr = {1,1,2,3,4,4};
    int[] result = {3,2};
    Assert.assertArrayEquals(num.solution(arr), result);
  }


  @Test
  public void run2() {
    int[] arr = {2,3};
    int[] result = {3,2};
    Assert.assertArrayEquals(num.solution(arr), result);
  }

  @Test
  public void run3() {
    int[] arr = null;
    int[] result = null;
    Assert.assertArrayEquals(num.solution(arr), result);
  }

  @Test
  public void run4() {
    int[] arr = {1,1,2,2,3,3,4,4,5,6};
    int[] result = {5,6};
    Assert.assertArrayEquals(num.solution(arr), result);
  }
}