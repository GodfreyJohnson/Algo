package com.single.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestSingleton {
  Singleton singleton = null;
  DoubleLockSingleton singleton2 = null;

  @Before
  public void init() {
    singleton = Singleton.getInstance();
    singleton2 = DoubleLockSingleton.getInstance();
  }

  @Test
  public void testInstance() {
    assertNotEquals(singleton, null);
    assertNotEquals(singleton2, null);
  }
}
