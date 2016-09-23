package com.offer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFindKSmallNum30 {
  FindKSmallNum30 k;

  @Before
  public void before() {
    k = new FindKSmallNum30();
  }

  @Test
  public void run() {
    int[] nums = {4, 5, 1, 6, 2, 7, 3, 8};
    int[] res = {4, 3, 1, 2};
    Assert.assertArrayEquals(k.solution(nums, 4), res);
  }

  @Test
  public void run2() {
    int[] nums = {4, 5, 1};
    int[] res = {4, 5, 1};
    Assert.assertArrayEquals(k.solution(nums, 4), res);
  }


  @Test
  public void run3() {
    int[] nums = {4, 1, 1};
    int[] res = {1, 1};
    Assert.assertArrayEquals(k.solution(nums, 2), res);
  }

  @Test
  public void run4() {
    int[] nums = {4, 4, 4};
    int[] res = {4, 4, 4};
    Assert.assertArrayEquals(k.solution(nums, 3), res);
  }
}
