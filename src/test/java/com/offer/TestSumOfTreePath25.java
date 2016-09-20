package com.offer;

import com.common.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

public class TestSumOfTreePath25 {
  SumOfTreePath25 tree;

  @Before
  public void before() {
    tree = new SumOfTreePath25();
  }

  @Test
  public void run() {
    TreeNode a = new TreeNode(10);
    TreeNode b = new TreeNode(5);
    TreeNode c = new TreeNode(12);
    TreeNode d = new TreeNode(4);
    TreeNode e = new TreeNode(7);

    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    Assert.assertEquals(tree.solution(a, 22, new Stack<TreeNode>()), a);
  }

  @Test
  public void run2() {
    TreeNode a = new TreeNode(10);
    TreeNode b = new TreeNode(5);
    TreeNode c = new TreeNode(12);
    TreeNode d = new TreeNode(4);
    TreeNode e = new TreeNode(7);
    TreeNode f = new TreeNode(1);
    TreeNode g = new TreeNode(1);

    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.left = f;
//    c.right = g;
    Assert.assertEquals(tree.solution(a, 22, new Stack<TreeNode>()), a);
  }

  @Test
  public void run3() {
    TreeNode a = new TreeNode(10);
    TreeNode b = new TreeNode(5);
    TreeNode c = new TreeNode(12);
    TreeNode d = new TreeNode(4);
    TreeNode e = new TreeNode(7);

    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    Assert.assertEquals(tree.solution(a, 2, new Stack<TreeNode>()), a);
  }
}
