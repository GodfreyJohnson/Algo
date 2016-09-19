package com.offer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStackPopOrder22 {
  StackPopOrder22 order;
  @Before
  public void before() {
    order = new StackPopOrder22();
  }

  @Test
  public void run() {
    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    List<Integer> result = new ArrayList<Integer>();
    result.add(4);
    result.add(5);
    result.add(3);
    result.add(2);
    result.add(1);
    Assert.assertEquals(order.solution(list, result), true);
  }

  @Test
  public void run2() {
    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    List<Integer> result = new ArrayList<Integer>();
    result.add(4);
    result.add(3);
    result.add(5);
    result.add(1);
    result.add(2);
    Assert.assertEquals(order.solution(list, result), false);
  }

}
