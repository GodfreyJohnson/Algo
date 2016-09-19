package com.offer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMinStack21 {
  MinStack21 minStack;
  @Before
  public void before() {
    minStack = new MinStack21();
  }

  @Test
  public void run() {
    minStack.push(1);
    Assert.assertEquals(minStack.min(), 1);
  }

  @Test
  public void run2() {
    minStack.push(1);
    minStack.push(2);
    minStack.push(3);
    Assert.assertEquals(minStack.min(), 1);
  }
  @Test
  public void run3() {
    minStack.push(2);
    minStack.push(1);
    minStack.push(3);
    minStack.pop();
    minStack.pop();
    Assert.assertEquals(minStack.min(), 2);
  }

  @Test
  public void run4() {
    minStack.push(2);
    minStack.push(1);
    minStack.push(3);
    minStack.pop();
    Assert.assertEquals(minStack.min(), 1);
  }

  @Test
  public void run5() {
    minStack.min();
    Assert.assertEquals(minStack.min(), -1);
  }

  @Test
  public void run6() {
    minStack.push(2);
    minStack.push(1);
    minStack.push(3);
    minStack.pop();
    minStack.pop();
    minStack.pop();
    Assert.assertEquals(minStack.min(), -1);
  }
}
