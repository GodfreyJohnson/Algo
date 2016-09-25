package com.offer;

import com.common.TreeNode;

/**
 * Created by godfrey on 16-9-25.
 */
public class DepthOfTree39 {
  public int solution(TreeNode a) {
    if (a == null)
      return 0;
    int depth = 1;

    int left = solution(a.left);
    int right = solution(a.right);

    depth += left > right ? left : right;
    return depth;
  }

}
