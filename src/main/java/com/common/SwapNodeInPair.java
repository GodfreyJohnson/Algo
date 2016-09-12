package com.common;

public class SwapNodeInPair {
  public static void main(String[] args) {
    SwapNodeInPair swapNodeInPair = new SwapNodeInPair();
    ListNode head = new ListNode(1);
    ListNode head2 = new ListNode(2);
    ListNode head3 = new ListNode(3);
    ListNode head4 = new ListNode(4);
    head.next = head2;
    head2.next = head3;
    head3.next = head4;
    swapNodeInPair.swapPairs(head);
  }

  public ListNode swapPairs(ListNode head) {
    if (head == null)
      return head;

    ListNode n1 = head, n2, n3, result, last = null;

    if (head.next != null)
      result = head.next;
    else
      result = head;
    while (n1 != null) {
      n2 = n1.next;
      if (n2 != null) {
        // get n3
        n3 = n2.next;
        // exchange
        n2.next = n1;
        n1.next = n3;

        if(last != null){
          last.next = n2;
        }

        last = n1;
        n1 = n3;
      } else {
        break;
      }
    }

    return result;
  }
}
