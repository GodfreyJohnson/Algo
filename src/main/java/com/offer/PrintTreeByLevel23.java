package com.offer;

import com.common.TreeNode;

import java.util.*;

public class PrintTreeByLevel23 {
  public List<Integer> solution(TreeNode t1) {
    if (t1 == null)
      return null;

    Deque<TreeNode> deque = new ArrayDeque<TreeNode>();
    deque.addFirst(t1);
    List<Integer> result = new ArrayList<Integer>();
    while (deque.size() > 0) {
      TreeNode tmp = deque.getFirst();
      result.add(tmp.val);
      deque.pop();

      if (tmp.left != null) {
        deque.addLast(tmp.left);
      }

      if (tmp.right != null) {
        deque.addLast(tmp.right);
      }
    }
    return result;
  }
  public List<Integer> solution2(TreeNode t1) {
    if (t1 == null)
      return null;

    Queue<TreeNode> deque = new ArrayDeque<TreeNode>();
    deque.add(t1);
    List<Integer> result = new ArrayList<Integer>();
    while (deque.size() > 0) {
      TreeNode tmp = deque.peek();
      result.add(tmp.val);
      deque.poll();

      if (tmp.left != null) {
        deque.add(tmp.left);
      }

      if (tmp.right != null) {
        deque.add(tmp.right);
      }
    }
    return result;
  }
}
