package com.Utils;

import com.common.ComplexListNode;
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

  public static void printArrayList(List<Integer> result) {
    System.out.println("Start to print integer list");
    if (result == null || result.size() <= 0)
      return;

    for (int num : result) {
      System.out.println(num);
    }
    System.out.println("Ends to print integer list");
  }

  public static void printStringArrayList(List<String> result) {
    System.out.println("Start to print string list");
    if (result == null || result.size() <= 0)
      return;

    for (String num : result) {
      System.out.println(num);
    }
    System.out.println("Ends to print String list");
  }

  public static void printComplexListNode(ComplexListNode root) {
    System.out.println("Start to print complex  list node");
    while (root != null) {
      System.out.println("root: " + root.val);
      if (root.next != null)
        System.out.println("next: " + root.next.val);
      if (root.sibling != null)
        System.out.println("sibling: " + root.sibling.val);
      root = root.next;
    }
    System.out.println("Ends to print complex  list node");
  }

  public static void printTreeNodeList(TreeNode result) {
    System.out.println("Start to print tree  list node");
    while (result != null) {
      System.out.print(result.val + "->");
      result = result.left;
    }
    System.out.println("");
    System.out.println("End to print tree  list node");
  }
}
