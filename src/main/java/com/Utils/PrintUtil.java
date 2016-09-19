package com.Utils;

import com.common.ListNode;
import com.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PrintUtil {
  public static void printIntArray(int[] nums) {
    System.out.println("Start to print array: ");
    for (int num : nums) {
      System.out.println(num);
    }
    System.out.println("End to print array!");
  }

  public static void printLinkedList(ListNode head) {
    if (head != null) {
      System.out.println("Start to print linked list: ");
      while (head != null) {
        System.out.println(head.val);
        head = head.next;
      }
      System.out.println("End to print linked list! ");
    }
  }

  public static void printTree(TreeNode root) {
    if (root == null)
      return;

    System.out.println("Start to print tree node");
    List<TreeNode> list = new ArrayList<TreeNode>();
    int sum = 0;
    int count = 1;
    list.add(root);
    while (count > 0) {
      int d = 0;
      for (int i = sum; i < sum + count; i++) {
        TreeNode node = list.get(i);
        if (node.left != null) {
          list.add(node.left);
          d++;
        }

        if (node.right != null) {
          list.add(node.right);
          d++;
        }
        System.out.print(node.val + " ");
      }
      System.out.println("");
      sum += count;
      count = d;
    }
    System.out.println("End to print tree node");
  }
}
