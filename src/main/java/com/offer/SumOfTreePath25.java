package com.offer;

import com.common.TreeNode;

import java.util.Stack;

public class SumOfTreePath25 {
  public TreeNode solution(TreeNode root, int target, Stack<TreeNode> stack) {
    if (root == null)
      return null;

    stack.push(root);
    // note: remember to check this node is the leaf node
    if (root.val == target && root.left == null && root.right == null) {
      for (int i =0; i <=  stack.size() - 1; i++) {
        System.out.print(stack.elementAt(i).val + "-");
      }
      System.out.println("");
    }

    if (root.left != null) {
      solution(root.left, target - root.val, stack);
    }

    if (root.right != null) {
      solution(root.right, target - root.val, stack);
    }

    stack.pop();
    return root;
  }
}
