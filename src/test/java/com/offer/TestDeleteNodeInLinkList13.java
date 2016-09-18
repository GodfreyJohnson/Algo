package com.offer;

import com.common.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDeleteNodeInLinkList13 {
  DeleteNodeInLinkList13 delete;

  @Before
  public void before() {
    delete = new DeleteNodeInLinkList13();
  }

  @Test
  public void run() {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2);
    ListNode c = new ListNode(3);
    a.next = b;
    b.next = c;
    Assert.assertEquals(delete.solution(a, b), a);
  }

  @Test
  public void run2() {
    ListNode a = new ListNode(1);
    ListNode b = a;
    Assert.assertEquals(delete.solution(a, b), null);
  }
}
