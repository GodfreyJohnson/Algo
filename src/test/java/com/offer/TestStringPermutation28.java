package com.offer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStringPermutation28 {
  StringPermutation28 permutation;

  @Before
  public void before() {
    permutation = new StringPermutation28();
  }

  @Test
  public void run() {
    String str = "abc";
    List<String> result = new ArrayList<>();
    result.add("abc");
    result.add("acb");
    result.add("bac");
    result.add("bca");
    result.add("cab");
    result.add("cba");
    Assert.assertEquals(permutation.solution(str, new ArrayList<String>(), new StringBuilder("")), result);

  }

  @Test
  public void run2() {
    Assert.assertEquals(permutation.solution("", new ArrayList<String>(), new StringBuilder("")), null);
  }

  @Test
  public void run3() {
    List<String> result = new ArrayList<>();
    result.add("a");
    Assert.assertEquals(permutation.solution("a", new ArrayList<String>(), new StringBuilder("")), result);
  }

}
