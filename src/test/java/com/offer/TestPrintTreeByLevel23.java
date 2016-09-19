package com.offer;

import com.common.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPrintTreeByLevel23 {
  PrintTreeByLevel23 tree;
  @Before
  public void before() {
    tree = new PrintTreeByLevel23();
  }

  @Test
  public void run() {
    TreeNode t1 = new TreeNode(1);
    TreeNode t2 = new TreeNode(2);
    TreeNode t3 = new TreeNode(3);
    TreeNode t4 = new TreeNode(4);
    TreeNode t5 = new TreeNode(5);
    TreeNode t6 = new TreeNode(6);
    TreeNode t7 = new TreeNode(7);

    t1.left = t2;
    t1.right = t3;
    t2.left = t4;
    t2.right = t5;
    t5.left = t6;
    t5.right = t7;

    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    Assert.assertEquals(tree.solution(t1), list);
  }

  @Test
  public void run2() {
    TreeNode t1 = new TreeNode(1);
    TreeNode t2 = new TreeNode(2);
    TreeNode t3 = new TreeNode(3);
    TreeNode t4 = new TreeNode(4);
    TreeNode t5 = new TreeNode(5);
    TreeNode t6 = new TreeNode(6);
    TreeNode t7 = new TreeNode(7);

    t1.left = t2;
    t1.right = t3;
    t2.left = t4;
    t2.right = t5;
    t5.left = t6;
    t5.right = t7;

    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    Assert.assertEquals(tree.solution2(t1), list);
  }
}
