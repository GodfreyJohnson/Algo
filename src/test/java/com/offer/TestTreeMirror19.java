package com.offer;

import com.common.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTreeMirror19 {
  TreeMirror19 tree;
  @Before
  public void before() {
    tree = new TreeMirror19();
  }

  @Test
  public void run() {
    TreeNode a = new TreeNode(1);
    TreeNode b = new TreeNode(2);
    TreeNode c = new TreeNode(3);
    a.left = b;
    a.right = c;
    Assert.assertEquals(tree.solution(a), a);
  }

  @Test
  public void run2() {
    TreeNode a = null;
    Assert.assertEquals(tree.solution(a), a);
  }


  @Test
  public void run3() {
    TreeNode a = new TreeNode(1);
    TreeNode b = new TreeNode(2);
    TreeNode c = new TreeNode(3);
    TreeNode d = new TreeNode(4);
    a.left = b;
    b.left = d;
    b.right = c;
    Assert.assertEquals(tree.solution(a), a);
  }
}
