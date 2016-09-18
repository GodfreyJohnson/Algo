package com.offer;

import com.common.TreeNode;

public class SubTree18 {

  public boolean solution(TreeNode t1, TreeNode t8) {
    return findLocation(t1, t8);
  }

  private boolean findLocation(TreeNode head, TreeNode target) {
    if (head == null || target == null)
      return true;
    boolean result = false;
    if (head.val == target.val)
      return checkSubTree(head, target);
    if (!result)
      result = findLocation(head.left, target);
    if (!result)
      result = findLocation(head.right, target);
    return result;
  }

  private boolean checkSubTree(TreeNode head, TreeNode target) {
    boolean result = false;
    if (target == null)
      return true;
    if (head == null)
      return false;
    if (head.val == target.val) {
      result = checkSubTree(head.right, target.right) && checkSubTree(head.left, target.left);
    }
    return result;
  }
}
