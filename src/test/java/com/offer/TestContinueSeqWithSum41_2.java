package com.offer;

import org.junit.Before;
import org.junit.Test;

public class TestContinueSeqWithSum41_2 {
  ContinueSeqWithSum41_2 sum;
  @Before
  public void before() {
    sum = new ContinueSeqWithSum41_2();
  }

  @Test
  public void run() {
    sum.solution(15);
  }

  @Test
  public void run2() {
    sum.solution(2);
  }

  @Test
  public void run3() {
    sum.solution(100);
  }
}
