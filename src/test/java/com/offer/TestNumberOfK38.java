package com.offer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by godfrey on 16-9-25.
 */
public class TestNumberOfK38 {
  NumberOfK38 num;

  @Before
  public void before() {
    num = new NumberOfK38();
  }

  @Test
  public void run() {
    int[] array = {1, 2, 3, 3, 3, 3, 4, 5};
    Assert.assertEquals(num.solution(array, 3), 4);
  }

  @Test
  public void run2() {
    int[] array = {1, 2, 4, 5};
    Assert.assertEquals(num.solution(array, 3), 0);
  }

  @Test
  public void run3() {
    int[] array = {3, 3, 3};
    Assert.assertEquals(num.solution(array, 3), 3);
  }

  @Test
  public void run4() {
    int[] array = null;
    Assert.assertEquals(num.solution(array, 3), 0);
  }

  @Test
  public void run5() {
    int[] array = {1, 2, 4, 5};
    Assert.assertEquals(num.solution(array, 7), 0);
  }

  @Test
  public void run6() {
    int[] array = {1, 2, 4, 5};
    Assert.assertEquals(num.solution(array, 5), 1);
  }

  @Test
  public void run7() {
    int[] array = {1, 2, 4, 5, 5};
    Assert.assertEquals(num.solution(array, 5), 2);
  }
}
