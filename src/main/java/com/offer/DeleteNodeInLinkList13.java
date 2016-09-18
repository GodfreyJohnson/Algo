package com.offer;

import com.common.ListNode;

/**
 * delete node in O(1)
 */
public class DeleteNodeInLinkList13 {
  public ListNode solution(ListNode head, ListNode target) {
    if (head == null || target == null)
      return null;

    // target is the head
    if (head == target)
      return head.next;

    // target is the tail, should get the pre node
    ListNode next = target.next;
    if (next == null) {
      ListNode root = head;
      while(root.next != target){
        root = root.next;
      }
      root.next = null;
      return head;
    }

    // target in the middle
    target.val = next.val;
    target.next = next.next;
    return head;
  }
}
