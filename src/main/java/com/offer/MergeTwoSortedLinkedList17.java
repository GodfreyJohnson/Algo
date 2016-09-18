package com.offer;

import com.Utils.PrintUtil;
import com.common.ListNode;

/**
 * merge two sorted linked list
 */
public class MergeTwoSortedLinkedList17 {
  // use iterator
  public ListNode solution(ListNode list1, ListNode list2) {
    if (list1 == null)
      return list2;
    if (list2 == null)
      return list1;
    ListNode result = null, resultHead = null;
    while (list1 != null || list2 != null) {
      if (list1 != null && list2 != null) {
        if (list1.val <= list2.val) {
          if (result == null) {
            result = list1;
          } else {
            result.next = list1;
            if (resultHead == null) {
              resultHead = result;
            }
            result = result.next;
          }
          list1 = list1.next;
        } else {
          if (result == null) {
            result = list2;
          } else {
            result.next = list2;
            if (resultHead == null) {
              resultHead = result;
            }
            result = result.next;
          }
          list2 = list2.next;
        }
      } else if (list1 != null) {
        result.next = list1;
        list1 = list1.next;
        result = result.next;
      } else {
        result.next = list2;
        list2 = list2.next;
        result = result.next;
      }
    }
    PrintUtil.printLinkedList(resultHead);
    return resultHead;
  }

  // use recursive
  public ListNode solution2(ListNode list1, ListNode list2) {
    if (list1 == null)
      return list2;
    if (list2 == null)
      return list1;
    ListNode result = null;
    if (list1.val < list2.val) {
      result = list1;
      result.next = solution2(list1.next, list2);
    } else {
      result = list2;
      result.next = solution2(list1, list2.next);
    }
    PrintUtil.printLinkedList(result);
    return result;
  }
}
