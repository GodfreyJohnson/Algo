package com.offer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestValidatePostOrderOfBinaryTree24 {
  ValidatePostOrderOfBinaryTree24 tree;
  @Before
  public void before() {
    tree = new ValidatePostOrderOfBinaryTree24();
  }

  @Test
  public void run() {
    int[] nums = {5,7,6,9,11,10,8};
    Assert.assertEquals(tree.solutions(nums), true);
  }
  @Test
  public void run2() {
    int[] nums = {7,4,6,5};
    Assert.assertEquals(tree.solutions(nums), false);
  }
  @Test
  public void run3() {
    int[] nums = new int[3];
    Assert.assertEquals(tree.solutions(nums), true);
  }

}
