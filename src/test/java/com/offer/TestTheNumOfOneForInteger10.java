package com.offer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTheNumOfOneForInteger10 {
  TheNumOfOneForInteger10 test;
  @Before
  public void before(){
    test = new TheNumOfOneForInteger10();
  }

  @Test
  public void testRun(){
    Assert.assertEquals(test.solution(9), 2);
  }

  @Test
  public void testRun2(){
    Assert.assertEquals(test.solution(0), 0);
  }

  @Test
  public void testRun3(){
//    Assert.assertEquals(test.solution(-9), 3);
  }

//  @Test
  public void testRun4(){
    Assert.assertEquals(test.solution2(9), 2);
  }

//  @Test
  public void testRun5(){
    Assert.assertEquals(test.solution2(0), 0);
  }

  @Test
  public void testRun6(){
    Assert.assertEquals(test.solution2(-9), 30);
  }

  @Test
  public void testRun7(){
    Assert.assertEquals(test.solution3(9), 2);
  }

  @Test
  public void testRun8(){
    Assert.assertEquals(test.solution3(0), 0);
  }

  @Test
  public void testRun9(){
    Assert.assertEquals(test.solution3(-9), 31);
  }
}
