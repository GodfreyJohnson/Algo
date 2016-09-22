package com.offer;

import org.junit.Before;
import org.junit.Test;

public class TestCombination28_1 {
  Combination28_1 com;
  @Before
  public void before() {
    com = new Combination28_1();
  }

  @Test
  public void run() {
    char[] chars = {'a', 'b', 'c','d'};
    com.solution(chars);
  }

}
