package com.mircosoft;

import com.microsoft.FourPairOfParentheses;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFourPairOfParentheses {
  private FourPairOfParentheses fourPairOfParentheses;

  @Before
  public void init() {
    fourPairOfParentheses = new FourPairOfParentheses();
  }

  @Test
  public void assertResult(){
    assertEquals(fourPairOfParentheses.solution(3), 5);
    assertEquals(fourPairOfParentheses.solution(2), 2);
  }

}
