package com.offer;

import com.common.TreeNode;

/**
 * Created by godfrey on 16-9-25.
 */
public class BalancedBinaryTre39_1 {
  public boolean solution(TreeNode root) {
    if (root == null)
      return true;

    if (root.left == null && root.right != null && (root.right.left != null || root.right.right != null))
      return false;

    if (root.right == null && root.left != null && (root.left.left != null || root.left.right != null))
      return false;

    boolean left = solution(root.left);
    boolean right = solution(root.right);

    return left && right;
  }
}

