package com.offer;

import com.Utils.PrintUtil;
import com.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeToDoubleLinkedList27 {
  public int solution(TreeNode root) {
//    if (root == null)
//      return null;
//
//    TreeNode left = null, right = null;
//    if (root.left != null) {
//      left = leftTree(root.left);
//      root.left = left;
//      left.right = root;
//    }
//
//    if(root.right != null) {
//      right = root.right;
//      root.right = right;
//      right.left = root;
//    }
//
//    if(left != null)
//      return left;
//    else
//      return root;
    List<Integer> list = new ArrayList<>();
    inOrder(root, list);
    PrintUtil.printArrayList(list);
    return 0;
  }

  private void inOrder(TreeNode root, List<Integer> list) {
    if(root == null)
      return;

    if(root.left != null) {
      inOrder(root.left, list);
    }
    list.add(root.val);
    if(root.right != null) {
      inOrder(root.right, list);
    }

  }

  private TreeNode leftTree(TreeNode root) {
    if (root == null)
      return null;

    TreeNode left = null, right = null, result = null;
    if (root.right != null) {
      right = rightTree(root.right);
      result = right;
    }
    if (root.left != null) {
      left = leftTree(root.left);
    }

    if (left != null) {
      left.right = root;
      root.left = left;
    }

    if (right != null) {
      root.right = right;
      right.left = root;
    } else {
      result = root;
    }

    return result;
  }

  private TreeNode rightTree(TreeNode root) {
    if (root == null)
      return null;

    TreeNode left = null, right = null, result = null;

    if (root.left != null) {
      left = leftTree(root.left);
      result = left;
    }

    if (root.right != null) {
      right = rightTree(root.right);
    }

    if (left != null) {
      left.right = root;
      root.left = left;
    } else {
      result = root;
    }

    if (right != null) {
      root.right = right;
      right.left = root;
    }

    return result;
  }
}
