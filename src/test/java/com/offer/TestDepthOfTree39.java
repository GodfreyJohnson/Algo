package com.offer;

import com.common.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDepthOfTree39 {
  DepthOfTree39 tree;

  @Before
  public void before() {
    tree = new DepthOfTree39();
  }

  @Test
  public void run() {
    TreeNode a = new TreeNode(1);
    TreeNode b = new TreeNode(2);
    TreeNode c = new TreeNode(3);
    a.left = b;
    a.right = c;
    Assert.assertEquals(tree.solution(a), 2);
  }


  @Test
  public void run2() {
    TreeNode a = new TreeNode(1);
    TreeNode b = new TreeNode(2);
    TreeNode c = new TreeNode(3);
    a.left = b;
    b.left = c;
    Assert.assertEquals(tree.solution(a), 3);
  }

  @Test
  public void run3() {
    TreeNode a = new TreeNode(1);
    Assert.assertEquals(tree.solution(a), 1);
  }

  @Test
  public void run4() {
    TreeNode a = null;
    Assert.assertEquals(tree.solution(a), 0);
  }
}