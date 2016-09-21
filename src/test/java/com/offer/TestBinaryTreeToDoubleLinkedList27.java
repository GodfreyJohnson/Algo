package com.offer;

import com.common.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBinaryTreeToDoubleLinkedList27 {
  BinaryTreeToDoubleLinkedList27 list;

  @Before
  public void before() {
    list = new BinaryTreeToDoubleLinkedList27();
  }

  @Test
  public void run() {
    TreeNode a = new TreeNode(10);
    TreeNode b = new TreeNode(6);
    TreeNode c = new TreeNode(14);
    TreeNode d = new TreeNode(4);
    TreeNode e = new TreeNode(8);
    TreeNode f = new TreeNode(12);
    TreeNode g = new TreeNode(16);
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.left = f;
    c.right = g;

    Assert.assertEquals(list.solution(a), 0);
  }

}
