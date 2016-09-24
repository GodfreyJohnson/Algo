package com.offer;

import com.common.ListNode;

public class FirstCommonNodesInLists37 {
  public int solution(ListNode a, ListNode d) {
    if (a == null || d == null)
      return 0;

    int len1 = 0, len2 = 0;
    ListNode l1 = a, l2 = d;
    while (l1 != null) {
      len1++;
      l1 = l1.next;
    }

    while (l2 != null) {
      len2++;
      l2 = l2.next;
    }
    if (len1 < len2) {
      ListNode tmp = a;
      a = d;
      d = tmp;

      int len = len1;
      len1 = len2;
      len2 = len;
    }
    int diff = len1 - len2;

    while (diff > 0 && a != null) {
      a = a.next;
      diff--;
    }

    while (a != null && d != null) {
      if (a.val == d.val && a.next == d.next) {
        return a.val;
      } else {
        a = a.next;
        d = d.next;
      }
    }
    return 0;
  }
}
