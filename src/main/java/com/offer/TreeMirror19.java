package com.offer;

import com.Utils.PrintUtil;
import com.common.TreeNode;

public class TreeMirror19 {
  public TreeNode solution(TreeNode root) {
    recursive(root);
    PrintUtil.printTree(root);
    return root;
  }

  public void recursive(TreeNode root) {
    if (root == null)
      return;

    TreeNode tmp = root.left;
    root.left = root.right;
    root.right = tmp;

    recursive(root.left);
    recursive(root.right);
  }
}
