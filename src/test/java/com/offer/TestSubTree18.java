package com.offer;

import com.common.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSubTree18 {
  SubTree18 subtree;

  @Before
  public void before() {
    subtree = new SubTree18();
  }

  @Test
  public void run() {
    TreeNode t1 = new TreeNode(8);
    TreeNode t2 = new TreeNode(8);
    TreeNode t8 = new TreeNode(8);
    TreeNode t3 = new TreeNode(7);
    TreeNode t4 = new TreeNode(9);
    TreeNode t5 = new TreeNode(2);
    TreeNode t9 = new TreeNode(9);
    TreeNode t10 = new TreeNode(2);
    TreeNode t6 = new TreeNode(4);
    TreeNode t7 = new TreeNode(7);

    t1.left = t2;
    t1.right = t3;
    t2.left = t4;
    t2.right = t5;
    t5.left = t6;
    t5.right = t7;

    t8.left = t9;
    t8.right = t10;
    Assert.assertEquals(subtree.solution(t1, t8), true);
  }

}
