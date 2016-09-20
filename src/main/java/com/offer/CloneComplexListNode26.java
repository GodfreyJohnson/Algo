package com.offer;

import com.Utils.PrintUtil;
import com.common.ComplexListNode;

class CloneComplexListNode26 {
  public int solution(ComplexListNode root) {
    if (root == null)
      return 0;

    PrintUtil.printComplexListNode(root);
    ComplexListNode result = this.cloneComplex(root);
    PrintUtil.printComplexListNode(result);

    return root.val;
  }

  private ComplexListNode cloneComplex(ComplexListNode root) {

    ComplexListNode head = root;

    // copy to next element
    while (head != null) {
      ComplexListNode tmp = new ComplexListNode(head.val);
      tmp.next = head.next;
      head.next = tmp;

      head = head.next.next;
    }

    // set sibling
    head = root;
    while (head != null) {
      if (head.sibling != null && head.next != null)
        head.next.sibling = head.sibling.next;
      head = head.next.next;
    }

    // delete even element
    head = root;
    boolean flag = true;
    ComplexListNode result = null;
    while (head != null) {
      if (flag) {
        result = head.next;
        flag = false;
      } else {
        if (head.next != null)
          head.next = head.next.next;
      }
      head = head.next;
    }

    return result;
  }
}
