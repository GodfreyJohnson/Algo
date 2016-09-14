package com.common;

/**
 * Created by godfrey on 16-9-14.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestDeleteNumFromString {
  private DeleteNumFromString deleteNumFromString;

  @Before
  public void before(){
    deleteNumFromString = new DeleteNumFromString();
  }

  @Test
  public void testRun(){
    Assert.assertEquals(deleteNumFromString.solution("abc123de4fg56"), "abcdefg");
  }
}
